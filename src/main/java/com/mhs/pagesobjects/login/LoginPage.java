package com.mhs.pagesobjects.login;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

    @FindBy(id = "email")
    private SelenideElement email;

    @FindBy(id = "password")
    private SelenideElement passwordLocator;

    @FindBy(css = ".green-btn")
    private SelenideElement loginButton;

    public void login(String username , String password) {
        email.waitUntil(Condition.appear , 5000);
        email.setValue(username);
        passwordLocator.setValue(password);
        loginButton.click();
    }
}
