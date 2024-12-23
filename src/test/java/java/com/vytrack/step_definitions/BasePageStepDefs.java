package java.com.vytrack.step_definitions;

import com.vytrack.pages.VehicleContractPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasePageStepDefs {

    VehicleContractPage vehicleContractPage = new VehicleContractPage();

    @When("the user switch to next window has title as {string}")
    public void the_user_switch_to_next_window_has_title_as(String title) {
        BrowserUtils.switchToWindow(title);
    }

    @Then("the user should be able to see url as {string}")
    public void the_user_should_be_able_to_see_url_as(String expectedUrl) {

        BrowserUtils.verifyURL(expectedUrl);
    }

    @When("the user navigates to {string} to {string}")
    public void the_user_navigates_to_to(String mainTab, String module) {
        vehicleContractPage.navigateToModule(mainTab, module);
    }

    @Then("the user should be able to see expected title as {string}")
    public void the_user_should_be_able_to_see_expected_title_as(String expectedTitle) {

        vehicleContractPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(vehicleContractPage.pageSubTitle, 20);
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("the user waits {int} seconds")
    public void the_user_waits_seconds(Integer seconds) {
        BrowserUtils.sleep(seconds);
    }

}
