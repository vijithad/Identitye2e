package com.identity.e2e.cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"classpath:com.identity.e2e.cuke"}, plugin = {"pretty", "html:output"}, strict = true)
public class RunCucumberTests {

}
