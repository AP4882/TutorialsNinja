package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {

	
	public HeadersSection() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	public static WebElement myAccountLink;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(name="search")
	public static WebElement Searchbox;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement SearchButton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement ShoppingCartButton;
	
	public static void NavigateToLoginPage() {
		Elements.click(myAccountLink);
		Elements.click(login);

	}
	
	
	public static void SearchProduct() {
		Elements.TypeText(Searchbox, Base.reader.getProduct());
		Elements.click(SearchButton);
	}
	
	public static void NavigateToShoppingCartPage() {
		Elements.click(ShoppingCartButton);
	}
}
