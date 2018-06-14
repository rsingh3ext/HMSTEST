package com.mhs.login;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.mhs.dataproviders.MHSDataProviders;
import com.mhs.pagesobjects.login.LoginPage;
import org.json.JSONObject;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;


public class Login {

    private LoginPage loginPage =  page(LoginPage.class);


  @Test(dataProvider = "loginDataProvider", dataProviderClass = MHSDataProviders.class)
  public void test(JSONObject loginObj)
    {
        Configuration.browser="chrome";
        Configuration.holdBrowserOpen=true;
        Selenide.open("http://ahms.appsndevs.com:9043/login");
        System.out.println(loginObj.getString("username"));
        loginPage.login(loginObj.getString("username") , loginObj.getString("password"));
    }
}
