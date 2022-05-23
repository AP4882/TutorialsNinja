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
	public void i_provide_all_the_below_details(DataTable dataTable)  {
	 
     RegistrationPage.enterAllDetails(dataTable, "unique");
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

	@Then("^I should see that user account is not created$")
	public void i_should_see_that_user_account_is_not_created() {
	  
		Assert.assertTrue(Elements.isDisplayed(RegistrationPage.RegisterBreadcrumb));
	}

	@And("^I should see Error messages informing the user to fill the mandatory fields$")
	public void i_should_see_Error_messages_informing_the_user_to_fill_the_mandatory_fields() throws Throwable {
	   
		Assert.assertTrue(Elements.isDisplayed(RegistrationPage.FirstnameWarning));
		
		Assert.assertTrue(Elements.isDisplayed(RegistrationPage.LastnameWarning));
		
		Assert.assertTrue(Elements.isDisplayed(RegistrationPage.EmailWarning));
		
		Assert.assertTrue(Elements.isDisplayed(RegistrationPage.TelephoneWarning));
		
		Assert.assertTrue(Elements.isDisplayed(RegistrationPage.MainWarning));
	}

	@And("^I subscribe to News letter$")
	public void i_subscribe_to_News_letter()  {
	    
		Elements.click(RegistrationPage.SubscribeNewsLetter);
	}

	@When("^I provide below duplicate details$")
	public void i_provide_below_duplicate_details(DataTable dataTable)  {
		
		RegistrationPage.enterAllDetails(dataTable,"duplicate");
		
	}

	@Then("^I should see that user is restricted to create a duplicate account$")
	public void i_should_see_that_user_is_restricted_to_create_a_duplicate_account() {
	      Assert.assertTrue(Elements.VerifyTextEquals(RegistrationPage.MainWarning, "Warning: E-Mail Address is already registered!"));

	}
	
}
