package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Placeorders {
	
	HeadersSection HeadersSection = new HeadersSection();
	LoginPage LoginPage = new LoginPage();
	SearchResultPage SearchResultPage = new SearchResultPage();
	ShoppingCartPage ShoppingCartPage = new ShoppingCartPage();
	CheckoutPage CheckoutPage = new CheckoutPage();
	OrderSuccessPage OrderSuccessPage = new OrderSuccessPage();

	@Given("^I login to the application$")
	public void i_login_to_the_application() {
	  
		Base.driver.get(Base.reader.getUrl());
		HeadersSection.NavigateToLoginPage();
		LoginPage.doLogin();
	}

	@When("^I add product to bag and checkout$")
	public void i_add_product_to_bag_and_checkout()  {
	   
		HeadersSection.SearchProduct();
		SearchResultPage.AddFirstProductToCart();
		HeadersSection.NavigateToShoppingCartPage();
		ShoppingCartPage.NavigateToCheckoutPage();
	}

	@And("^I place an order$")
	public void i_place_an_order() throws Throwable {
	    
		CheckoutPage.PlaceAnOrder();
	}

	@Then("^I should see that order is successfully placed$")
	public void i_should_see_that_order_is_successfully_placed()  {
	   
		Waits.waitUntilElementLocated(10,OrderSuccessPage.SuccessBreadCrumb );
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.SuccessBreadCrumb));
	}


}
