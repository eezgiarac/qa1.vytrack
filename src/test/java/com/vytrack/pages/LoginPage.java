package com.vytrack.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;


    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement btn_submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        btn_submit.click();
        // verification that we logged
    }


    public void login(String role) {

        //based on input enter that user information
        String username = ConfigurationReader.getProperty(role + "_username");

        String password = ConfigurationReader.getProperty(role + "_password");

        login(username, password);

    }

}
