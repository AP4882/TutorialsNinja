package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

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
	
	@FindBy(linkText="Register")
	public static WebElement RegisterBreadcrumb;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement FirstnameWarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement LastnameWarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement EmailWarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement TelephoneWarning;
	
	@FindBy(css="div[class$='alert-dismissible")
	public static WebElement MainWarning;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement SubscribeNewsLetter;
	
	public static void enterAllDetails(DataTable dataTable,String DetailsType) {
		
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		Elements.TypeText(RegistrationPage.FirstName, map.get("FirstName"));
		Elements.TypeText(RegistrationPage.LastName, map.get("LastName"));
		
		Elements.TypeText(RegistrationPage.Telephone, map.get("Telephone"));
		Elements.TypeText(RegistrationPage.Password, map.get("Password"));
		Elements.TypeText(RegistrationPage.ConfirmPassword, map.get("Password"));
		
		if(DetailsType.equalsIgnoreCase("duplicate")) {
			Elements.TypeText(RegistrationPage.Email, map.get("Email"));
		}else {
			
			Elements.TypeText(RegistrationPage.Email, System.currentTimeMillis()+map.get("Email"));
		}
	}
	
}
