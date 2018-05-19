package com.identity.e2e.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ViewVehiclePage extends BaseClass {

	public ViewVehiclePage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how= How.XPATH, using="//form[@action='/ConfirmVehicle']//input[@id='Vrm']")
	public static WebElement registrationNumber;


	@FindBy(how= How.NAME, using="Continue")
	public static WebElement continueButton;

		
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
