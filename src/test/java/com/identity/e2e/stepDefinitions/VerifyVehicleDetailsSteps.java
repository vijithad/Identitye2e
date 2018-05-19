package com.identity.e2e.stepDefinitions;

import com.identity.e2e.cuke.Hooks;
import com.identity.e2e.pageobjects.ViewVehiclePage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;


public class VerifyVehicleDetailsSteps {
    public WebDriver driver;
    public List<HashMap<String,String>> datamap;


    public VerifyVehicleDetailsSteps()
    {
    	driver = Hooks.driver;
     	//datamap = DataHelper.data();
    }
    

    @Then("^I verify details on Vehicle Details page$")
    public void enterVehicleRegistration() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, ViewVehiclePage.class);
      //  Log.info("Click action is perfromed on My Account link" );
       // ViewVehiclePage.registrationNumber.sendKeys(map.get(0).get("username"));
        ViewVehiclePage.registrationNumber.sendKeys("RF03MMK");
        ViewVehiclePage.continueButton.click();
    }

    
}