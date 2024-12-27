package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashboardPageStepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    @Then("the user should be able to see {string}")
    public void the_user_should_be_able_to_see(String moduleNames) {

        List<String> actualModuleNames= BrowserUtils.getElementsText(dashboardPage.modules);
        String[] eachName = moduleNames.split(",");
        List<String> expectedModuleNames=new ArrayList<>(Arrays.asList(eachName));
        Assert.assertEquals(expectedModuleNames,actualModuleNames);

    }


    @When("the user clicks the help link")
    public void the_user_clicks_the_help_link() {
    dashboardPage.link_help.click();
    }

    @When("the user clicks the pinbar link")
    public void the_user_clicks_the_pinbar_link() {
        dashboardPage.link_pinbar.click();
    }

}
