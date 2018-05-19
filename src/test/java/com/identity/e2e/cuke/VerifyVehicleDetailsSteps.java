package com.identity.e2e.cuke;

import com.identity.e2e.pageobjects.VehicleDetailsPage;
import com.identity.e2e.pageobjects.ViewVehiclePage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class VerifyVehicleDetailsSteps {
    private final WebDriver driver = Context.get("driver", WebDriver.class);

    @Then("^I verify details on Vehicle Details page$")
    public void i_verify_details_on_Vehicle_Details_page(String vehicle,String make, String color) throws Throwable {
        PageFactory.initElements(driver, VehicleDetailsPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //  Log.info("Click action is perfromed on My Account link" );
        // ViewVehiclePage.registrationNumber.sendKeys(map.get(0).get("username"));
        assertEquals("Is this the vehicle you are looking for?", VehicleDetailsPage.page_heading.getText());
        assertEquals(VehicleDetailsPage.registrationNumber.getText(),vehicle);
        assertEquals(VehicleDetailsPage.summaryList.get(1).getText(),make);
        assertEquals(VehicleDetailsPage.summaryList.get(2).getText(),color);
        VehicleDetailsPage.yes.click();
        VehicleDetailsPage.continueButton.click();
    }


}