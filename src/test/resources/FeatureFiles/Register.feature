Feature: Registration functionality scenarios


@Register @One
Scenario: Verify whether the user is able to register into the application by providing all the details

Given I launch the application
And Navigate to account registration page
When I provide all the below details
  | FirstName| Ashish                |
  | LastName | Pabitwar              |
  | Email    | apabitwar2018@gmail.com |
  | Telephone | 9595295992             |
  | Password  | ap@4882                |
  
 And I select the privacy policy
 And I click on Continue button
 Then User Registration should be successful