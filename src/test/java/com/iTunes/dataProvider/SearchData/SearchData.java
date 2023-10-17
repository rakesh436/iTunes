package com.iTunes.dataProvider.SearchData;

import com.iTunes.Constants.ErrorMessages.SearchError.SearchMessage;
import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Map;

public class SearchData {

    @DataProvider(name = "searchData")
    public Object[][] searchQuery() {

        Map<String, Object> params = new HashMap<>();
        params.put("term", "Sanjay+Dutt");
        params.put("country", "IN");
        params.put("media", "movie");
        params.put("limit", -1);

        //test the limit param
        Map<String, Object> limitTest = new HashMap<>();
        limitTest.put("term", "Sanjay+Dutt");
        limitTest.put("country", "IN");
        limitTest.put("media", "movie");
        limitTest.put("limit", 1);

        Map<String, Object> mediaTest = new HashMap<>();
        mediaTest.put("term", "Sanjay+Dutt");
        mediaTest.put("country", "IN");
        mediaTest.put("media", "music-video");

        return new Object[][]{
                {params, SearchMessage.VALID, -1, "feature-movie"},
                {limitTest, SearchMessage.VALID, 1, "feature-movie"},
                {mediaTest, SearchMessage.INVALID_VALUES, -1, "music-video"}
        };
    }

    @DataProvider(name = "schemaValidator")
    public Object[][] schemaValidator() {

        Map<String, String> params = new HashMap<>();
        params.put("term", "Sanjay+Dutt");
        params.put("country", "IN");
        params.put("media", "movie");

        return new Object[][]{{params}};
    }
}
