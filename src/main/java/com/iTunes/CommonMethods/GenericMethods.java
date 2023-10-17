package com.iTunes.CommonMethods;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.Map;
import java.util.logging.Logger;

import static com.iTunes.Constants.URL.BaseUrl.getBASE_URL;
import static io.restassured.RestAssured.given;


/**
 * The type Generic methods.
 */
public class GenericMethods {

    protected final Logger log = Logger.getLogger(getClass().getName());

    protected Response get(String endPoint, Map<String, Object> params) {
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(getBASE_URL())
                .setAccept(ContentType.JSON)
                .build();


        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .build().response().contentType(ContentType.JSON);

        return given()
                .spec(requestSpecification)
                .queryParams(params)
                .when()
                .get(endPoint)
                .then()
                .spec(responseSpecification)
                .extract()
                .response();
    }

}
