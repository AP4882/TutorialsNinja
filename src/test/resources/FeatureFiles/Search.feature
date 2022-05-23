Feature: Search functionality scenarios

@SearchTest1
Scenario: Verify whether user is able to search for products


Given I launch the application
When I search for a product "Samsung syncmaster 941BW"
Then I should see the product in the search results

@SearchTest2
Scenario: Verify whether the user is being informed if product is not available


Given I launch the application
When I search for a product "Apple Iphone"
Then I should see a message informing "There is no product that matches the search criteria."