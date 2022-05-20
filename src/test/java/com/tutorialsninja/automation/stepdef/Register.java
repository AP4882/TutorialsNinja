package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register {

	@Given("^I launch the application$")
	public void i_launch_the_application() throws InterruptedException {
	   
		Base.driver.get(Base.reader.getUrl());
		Thread.sleep(3000);
	}

	@And("^Navigate to account registration page$")
	public void navigate_to_account_registration_page() {
	   
	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable datatable)  {
	  
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
	    
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button() {
	    
	}

	@Then("^User Registration should be successful$")
	public void user_Registration_should_be_successful() {
	    
	}


	
}
