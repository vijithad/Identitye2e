package com.identity.e2e.stepDefinitions;

import com.identity.e2e.cuke.Hooks;
import com.identity.e2e.pageobjects.ViewVehiclePage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;


public class GetVehicleInformationSteps {
    public WebDriver driver;
    public List<HashMap<String,String>> datamap;


    public GetVehicleInformationSteps()
    {
    	driver = Hooks.driver;
     	//datamap = DataHelper.data();
    }
    
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


}