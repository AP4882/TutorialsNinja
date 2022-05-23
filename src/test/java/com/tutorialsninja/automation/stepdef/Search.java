package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Search {

	HeadersSection HeadersSection = new HeadersSection();
	SearchResultPage SearchResultPage = new SearchResultPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product) throws InterruptedException  {
	    
		Elements.TypeText(HeadersSection.Searchbox, product);
		Elements.click(HeadersSection.SearchButton);
		Thread.sleep(3000);
	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results() {
	   
		Assert.assertTrue(Elements.isDisplayed(SearchResultPage.searchresult));
	}

	
	@Then("^I should see a message informing \"([^\"]*)\"$")
	public void i_should_see_a_message_informing(String meassage) {
	   
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.noResultsmessage, meassage));
	}
}
