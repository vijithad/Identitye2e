package com.identity.e2e.cuke;

import com.identity.e2e.helpers.Log;
import com.identity.e2e.pageobjects.DVLAStartPage;
import com.identity.e2e.pageobjects.VehicleDetailsPage;
import com.identity.e2e.pageobjects.ViewVehiclePage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class GetVehicleInformationSteps {
    private final WebDriver driver = Context.get("driver", WebDriver.class);

    @When("^I Enter Vehicle Registration Number \"([^\"]*)\" and proceed$")
    public void i_Enter_Vehicle_Registration_Number_and_proceed(String vehicle) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, ViewVehiclePage.class);
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        Log.info("Vehicle Registration Page");
        assertEquals("Enter the registration number of the vehicle", ViewVehiclePage.page_heading.getText());
        //  Log.info("Click action is perfromed on My Account link" );
        // ViewVehiclePage.registrationNumber.sendKeys(vehicle);
        ViewVehiclePage.registrationNumber.sendKeys(vehicle);
        wait.until(ExpectedConditions.elementToBeClickable(ViewVehiclePage.continueButton));
        ViewVehiclePage.continueButton.click();
    }

}