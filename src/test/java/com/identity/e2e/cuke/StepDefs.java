package com.identity.e2e.cuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {

    @Given("^there are (\\d+) xslx files and (\\d+) csv files and a txt file containing (\\d+) vehicles each$")
    public void there_are_xslx_files_and_csv_files_and_a_txt_file_containing_vehicles_each(final int xlsxFiles,
                                                                                           final int csvFiles,
                                                                                           final int textFiles) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("----------xlsxFiles--" + xlsxFiles);
        System.out.println("----------csvFiles--" + csvFiles);
        System.out.println("----------textFiles--" + textFiles);
        System.out.println("----------implement me--");
    }

    @When("^get vehicles is called$")
    public void get_vehicles_is_called() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("----------implement me--");
    }

    @Then("^only (\\d+) vehicles are returned$")
    public void only_vehicles_are_returned(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("----------implement me--");
    }

}
