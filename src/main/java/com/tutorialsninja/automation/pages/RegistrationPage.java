package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class RegistrationPage {

	public RegistrationPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement FirstName;
	
	@FindBy(id="input-lastname")
	public static WebElement LastName;
	
	@FindBy(id="input-email")
	public static WebElement Email;
	
	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(id="input-confirm")
	public static WebElement ConfirmPassword;
	
	@FindBy(name="agree")
	public static WebElement PrivacyPolicy;
	
	@FindBy(css="input[type='Submit'][value='Continue']")
	public static WebElement ContinueButton;
}
