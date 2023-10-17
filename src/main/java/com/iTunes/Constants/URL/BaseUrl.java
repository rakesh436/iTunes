package com.iTunes.Constants.URL;

public class BaseUrl {

    private final String BASE_URL = "https://itunes.apple.com";

    public static String getBASE_URL(){
        return new BaseUrl().BASE_URL;
    }
}
