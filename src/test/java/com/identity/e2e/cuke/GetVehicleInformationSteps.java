package com.identity.e2e.cuke;

import com.identity.e2e.pageobjects.DVLAStartPage;
import com.identity.e2e.pageobjects.ViewVehiclePage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GetVehicleInformationSteps {
    private final WebDriver driver = Context.get("driver", WebDriver.class);

    @When("^I open DVLA Vehicle View website$")
    public void getVehicleInformationPage() throws Throwable {
        //This url can be mapped from properties file
        driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
    }

    @When("^I Enter Vehicle Registration Number$")
    public void enterVehicleRegistration() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, ViewVehiclePage.class);
        //  Log.info("Click action is perfromed on My Account link" );
        // ViewVehiclePage.registrationNumber.sendKeys(map.get(0).get("username"));
        ViewVehiclePage.registrationNumber.sendKeys("RF03MMK");
        ViewVehiclePage.continueButton.click();
    }

    @When("^I click on StartNow Link$")
    public void i_click_on_StartNow_Link() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, DVLAStartPage.class);
        //  Log.info("Click action is perfromed on My Account link" );
        wait.until(ExpectedConditions.elementToBeClickable(DVLAStartPage.startNowLink));
        DVLAStartPage.startNowLink.click();

    }

    @When("^I Enter Vehicle Registration Number and proceed$")
    public void i_Enter_Vehicle_Registration_Number_and_proceed() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, ViewVehiclePage.class);
        //  Log.info("Click action is perfromed on My Account link" );
        // ViewVehiclePage.registrationNumber.sendKeys(map.get(0).get("username"));
        ViewVehiclePage.registrationNumber.sendKeys("RF03MMK");
        wait.until(ExpectedConditions.elementToBeClickable(ViewVehiclePage.continueButton));
        ViewVehiclePage.continueButton.click();
    }

}