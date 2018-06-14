package com.mhs.dataproviders;

import com.mhs.utilities.BaseDataProvider;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;


public class MHSDataProviders extends BaseDataProvider{

    @DataProvider(name = "loginDataProvider")
    public static Object[][] loginData() {
        JSONObject[] myData = getTestData(MHSDataProviders.class, "loginData.json");
        return new Object[][] {myData};
    }
}
