package com.identity.e2e.cuke;

import com.identity.e2e.pageobjects.ViewVehiclePage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class VerifyVehicleDetailsSteps {
    private final WebDriver driver = Context.get("driver", WebDriver.class);

    @Then("^I verify details on Vehicle Details page$")
    public void i_verify_details_on_Vehicle_Details_page() throws Throwable {
        PageFactory.initElements(driver, ViewVehiclePage.class);
        //  Log.info("Click action is perfromed on My Account link" );
        // ViewVehiclePage.registrationNumber.sendKeys(map.get(0).get("username"));
        ViewVehiclePage.registrationNumber.sendKeys("RF03MMK");
        ViewVehiclePage.continueButton.click();
    }


}