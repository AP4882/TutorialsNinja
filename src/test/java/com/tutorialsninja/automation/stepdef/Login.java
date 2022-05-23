package com.tutorialsninja.automation.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.*;

public class Login {
	
	HeadersSection HeadersSection = new HeadersSection();
	LoginPage LoginPage = new LoginPage();
	MyAccountPage MyAccountPage = new MyAccountPage();
	ForgotPasswordPage ForgotPasswordPage = new ForgotPasswordPage();

	@And("^I navigate to account Login page$")
	public void i_navigate_to_account_Login_page()  {
	  
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
	}

	@When("^I login to the application using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_username_and_password(String email, String pass) throws InterruptedException  {
	   
		Elements.TypeText(LoginPage.EmailField, email);
		Elements.TypeText(LoginPage.PasswordField, pass);
		Elements.click(LoginPage.LoginButton);
		Thread.sleep(3000);
	}

	@Then("^I should be able to login to application successfully$")
	public void i_should_be_able_to_login_to_application_successfully()  {
	 
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.RegisterAffilateAccount));
		
	}

	@Then("^I should see an error message that credentials are invalid$")
	public void i_should_see_an_error_message_that_credentials_are_invalid()  {
	    Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.MainWarning, "Warning: No match for E-Mail Address and/or Password."));
	}

	@When("^I reset the forgotten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for_email(String email)  {
	 
		Elements.click(LoginPage.ForgotPassword);
		Elements.TypeText(ForgotPasswordPage.Emailfield, email);
		Elements.click(ForgotPasswordPage.ContinueButton);
	}
	
	
	@Then("^I should see message informing the user that information related to resetting have been sent to email address$")
	public void i_should_see_message_informing_the_user_that_information_related_to_resetting_have_been_sent_to_email_address() {
	
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.MainWarning, "An email with a confirmation link has been sent your email address."));
	}

	
	
}
