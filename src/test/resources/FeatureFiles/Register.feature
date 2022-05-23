Feature: Registration functionality scenarios


@RegisterTest1
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
 
 @RegisterTest2
 Scenario: Verify whether the user is not allowed to register on skipping the mandatory fields
 
 Given I launch the application
 And Navigate to account registration page
 When I click on Continue button
 Then I should see that user account is not created
 And I should see Error messages informing the user to fill the mandatory fields
 
 @RegisterTest3
 Scenario: Verify whether the user is able to register into the application by subscribing to newsletter
 
 Given I launch the application
 And Navigate to account registration page
 When I provide all the below details
  | FirstName| Ashish                |
  | LastName | Pabitwar              |
  | Email    | apabitwar2018@gmail.com |
  | Telephone | 9595295992             |
  | Password  | ap@4882                |
  And I select the privacy policy
  And I subscribe to News letter
  And I click on Continue button
  Then User Registration should be successful
  
  @RegisterTest4
  Scenario: Verify whether the user is restricted from creating a duplicate account
  
  Given I launch the application
  And Navigate to account registration page
  When I provide below duplicate details
  | FirstName| Ashish                |
  | LastName | Pabitwar              |
  | Email    | apabitwar2018@gmail.com |
  | Telephone | 9595295992             |
  | Password  | ap@4882                |
  And I select the privacy policy
  And I click on Continue button
  Then I should see that user is restricted to create a duplicate account
  
 