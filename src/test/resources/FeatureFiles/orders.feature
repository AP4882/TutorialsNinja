Feature: scenarios related to placing orders


@OrdersTest1
Scenario: Verify whether the user is able to place orders

Given I login to the application
When I add product to bag and checkout
And I place an order
Then I should see that order is successfully placed
