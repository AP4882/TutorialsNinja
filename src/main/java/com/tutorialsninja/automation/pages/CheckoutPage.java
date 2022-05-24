package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {

	public CheckoutPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement ContinueButtonOfBillingDeatilsSection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement ContinueButtonOfDeliveryDetailsSection;
	
	@FindBy(id="button-shipping-method")
	public static WebElement ContinueButtonOfDeliveryMethodSection;
	
	@FindBy(name="agree")
	public static WebElement TermsAndConditionsCheckbox;
	
	@FindBy(id="button-payment-method")
	public static WebElement ContinueButtonOfPaymentMethodSection;
	
	@FindBy(id="button-confirm")
	public static WebElement ConfirmOrderButton;
	
	
	public static void PlaceAnOrder() {
		Elements.click(ContinueButtonOfBillingDeatilsSection);
		Elements.click(ContinueButtonOfDeliveryDetailsSection);
		Elements.click(ContinueButtonOfDeliveryMethodSection);
		Elements.click(TermsAndConditionsCheckbox);
		Elements.click(ContinueButtonOfPaymentMethodSection);
		Elements.click(ConfirmOrderButton);
	}
	
}
