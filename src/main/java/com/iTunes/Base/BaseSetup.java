package com.iTunes.Base;

import com.iTunes.ServiceMethods.SearchMethods.SearchMethod;
import org.testng.annotations.BeforeSuite;

public class BaseSetup {

    protected final SearchMethod searchMethod ;
//    protected final Loo searchMethod ;

    public  BaseSetup(){
        searchMethod = new SearchMethod();
    }
}
