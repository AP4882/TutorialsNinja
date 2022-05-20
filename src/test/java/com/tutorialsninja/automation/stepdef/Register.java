package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegistrationPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Register {

	HeadersSection HeadersSection = new HeadersSection();
	RegistrationPage RegistrationPage = new RegistrationPage();
	AccountSuccessPage SuccessPage = new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws InterruptedException {
	   
		Base.driver.get(Base.reader.getUrl());
		Thread.sleep(4000);
	}

	@And("^Navigate to account registration page$")
	public void navigate_to_account_registration_page() throws InterruptedException {
	   
		Elements.click(HeadersSection.myAccountLink);
		Thread.sleep(4000);
		Elements.click(HeadersSection.register);
		Thread.sleep(4000);
	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable datatable)  {
	 
		Map<String, String> map = datatable.asMap(String.class, String.class);
		Elements.TypeText(RegistrationPage.FirstName, map.get("FirstName"));
		Elements.TypeText(RegistrationPage.LastName, map.get("LastName"));
		Elements.TypeText(RegistrationPage.Email, map.get("Email"));
		Elements.TypeText(RegistrationPage.Telephone, map.get("Telephone"));
		Elements.TypeText(RegistrationPage.Password, map.get("Password"));
		Elements.TypeText(RegistrationPage.ConfirmPassword, map.get("Password"));
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
	    
		Elements.click(RegistrationPage.PrivacyPolicy);	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button() throws InterruptedException {
	    
		Elements.click(RegistrationPage.ContinueButton);
		Thread.sleep(4000);
	}

	@Then("^User Registration should be successful$")
	public void user_Registration_should_be_successful() {
	    
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.Successbreadcrumb));
	}


	
}
