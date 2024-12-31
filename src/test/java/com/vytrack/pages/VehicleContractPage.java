package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleContractPage extends BasePage{

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages '][2]/div")
    public WebElement txt_message;

}
