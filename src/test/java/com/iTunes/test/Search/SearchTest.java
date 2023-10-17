package com.iTunes.test.Search;

import com.iTunes.Base.BaseSetup;
import com.iTunes.Constants.ErrorMessages.SearchError.SearchMessage;
import com.iTunes.dataProvider.SearchData.SearchData;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.hasEntry;

public class SearchTest extends BaseSetup {

    @Test(dataProviderClass = SearchData.class, dataProvider = "searchData")
    public void searchTest(Map<String, Object> params, SearchMessage msg, int limit, String media) {


        Response response = searchMethod.search(params);
        JsonPath jsonPath = response.jsonPath();

        System.out.println(response.statusCode());
        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),  msg.getERROR_CODE());
        if ( msg.getERROR_CODE() == 200) {
            response.then().body("results[0]", hasEntry("country", "IND"));
            response.then().body("results[0]", hasEntry("kind", media));
            List<String> country = jsonPath.get("results.findAll{it.country == 'IND'}");

            Assert.assertEquals(country.size(), jsonPath.getInt("resultCount"));

            if (limit != -1) {
                Assert.assertEquals(jsonPath.getInt("resultCount"), limit);
                Assert.assertEquals(jsonPath.getList("results").size(), limit);
            }

        }else if( msg.getERROR_CODE() == 400){

            Assert.assertEquals(jsonPath.getString("errorMessage"),msg.getERROR_MESSAGE());

        }

    }

    @Test(description = "Validate the response schema",
            dataProviderClass = SearchData.class, dataProvider = "schemaValidator")
    public void searchSchemaValidatorTest(Map<String, Object> params) {

        Response response = searchMethod.search(params);
        response.then().
                assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(new File("./Schema/search.json")));
    }
}
