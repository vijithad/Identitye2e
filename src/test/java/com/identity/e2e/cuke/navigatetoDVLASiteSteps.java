package com.identity.e2e.cuke;

import com.identity.e2e.helpers.Log;
import com.identity.e2e.pageobjects.DVLAStartPage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class navigatetoDVLASiteSteps {
    private final WebDriver driver = Context.get("driver", WebDriver.class);

    @When("^I open DVLA Vehicle View website$")
    public void i_open_DVLA_Vehicle_View_website() throws Throwable {
        //This url can be mapped from properties file
        driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
        Log.info("Opening Vehicle Information DVLA site");
    }

    @When("^I click on StartNow Link$")
    public void i_click_on_StartNow_Link() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, DVLAStartPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(DVLAStartPage.startNowLink));
        DVLAStartPage.startNowLink.click();
        Log.info("Click action is performed on StartNow link" );
    }


}