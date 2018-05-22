package com.identity.e2e.cuke;

import com.identity.e2e.pageobjects.VehicleDetailsPage;
import com.identity.e2e.pageobjects.ViewVehiclePage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class VerifyVehicleDetailsSteps {
    private final WebDriver driver = Context.get("driver", WebDriver.class);

    @Then("^I verify details on Vehicle Details page for \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_verify_details_on_Vehicle_Details_page_for(String vehicle,String make, String color) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, VehicleDetailsPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //  Log.info("Click action is perfromed on My Account link" );

        assertEquals("Is this the vehicle you are looking for?", VehicleDetailsPage.page_heading.getText());
        assertEquals(vehicle,VehicleDetailsPage.registrationNumber.getText().replaceAll("\\s+",""));
        assertTrue("Make of the Vehicle Doesnt match",VehicleDetailsPage.summaryList.get(1).getText().contains(make));
        assertTrue("color of the Vehicle doesnt match",VehicleDetailsPage.summaryList.get(2).getText().contains(color));

        VehicleDetailsPage.yes.click();
        VehicleDetailsPage.continueButton.click();
    }

}