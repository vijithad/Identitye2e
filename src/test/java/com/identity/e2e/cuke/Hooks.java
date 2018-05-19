package com.identity.e2e.cuke;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {

    private static ChromeDriverService service;
    private WebDriver driver;

    @Before
    /*
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void init() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("chromedriver"))
                .usingAnyFreePort()
                .build();
        service.start();
        driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        //Store the driver for future thread safe usage in step definitions
        Context.init();
        Context.set("driver", driver);
    }


    @After
    /*
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }
        Context.destroy();
        driver.quit();
        service.stop();
    }

}