package com.vytrack.step_definitions;



import com.vytrack.pages.DashboardPage;
import io.cucumber.java.en.When;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;

public class LoginPageStepDefs {
    DashboardPage dashboardPage=new DashboardPage();

    @When("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Login to app in Before method");
    }

    @When("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
      userType=  userType.toLowerCase();
        if (userType.contains(" "))
       userType= userType.replace(" ","_");

        new LoginPage().login(userType);

        BrowserUtils.waitForVisibility(dashboardPage.dashboardLogo,20);
    }

    @When("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
        BrowserUtils.waitForVisibility(dashboardPage.dashboardLogo,20);
    }


}
