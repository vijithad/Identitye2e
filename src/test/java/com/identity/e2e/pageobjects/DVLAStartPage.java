package com.identity.e2e.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DVLAStartPage extends BaseClass {

	public DVLAStartPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how= How.LINK_TEXT, using="Start now")
	public static WebElement startNowLink;

}
