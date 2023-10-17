package com.iTunes.ServiceMethods.SearchMethods;

import com.iTunes.CommonMethods.GenericMethods;
import io.restassured.response.Response;

import java.util.Map;
import static com.iTunes.Constants.URI.Search.SEARCH;

public class SearchMethod extends GenericMethods {

    public Response search(Map<String,Object> param){
       return get(SEARCH,param);
    }
}
