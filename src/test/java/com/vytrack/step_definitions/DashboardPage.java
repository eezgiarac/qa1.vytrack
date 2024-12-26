package com.vytrack.step_definitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vytrack.pages.BasePage;
import java.util.List;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li/a//span")
    public List<WebElement> modules;

    @FindBy(xpath = "//h1[@class=\"logo logo-text\"]")
    public WebElement dashboardLogo;


    @FindBy(xpath = "//a[@class=\"help no-hash\"]")
    public WebElement link_help;

    @FindBy(xpath = "//div[@class='pin-bar-empty']/a")
    public WebElement link_pinbar;






}
