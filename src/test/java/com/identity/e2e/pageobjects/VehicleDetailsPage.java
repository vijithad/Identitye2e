package com.identity.e2e.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleDetailsPage extends BaseClass{

	public VehicleDetailsPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how= How.CLASS_NAME, using="heading-large")
	public static WebElement page_heading;

	@FindBy(how= How.CLASS_NAME, using="reg-mark")
	public static WebElement registrationNumber;
	
	@FindBy(how= How.XPATH, using="total_price")
	public static WebElement make;
	
	@FindBy(how= How.XPATH, using="Proceed to checkout")
	public static WebElement color;

	@FindBy(how= How.ID, using="Correct_True")
	public static WebElement yes;

	@FindBy(how= How.ID, using="Correct_False")
	public static WebElement no;

	@FindBy(how= How.NAME, using="Continue")
	public static WebElement continueButton;
	
	

}
