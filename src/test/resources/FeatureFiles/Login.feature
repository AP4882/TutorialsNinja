Feature: Login Functionality scenarios


@LoginTest1
Scenario: Verify whether the user is able to login with valid credentials

Given I launch the application
And I navigate to account Login page
When I login to the application using username "apabitwar2018@gmail.com" and password "ap@4882"
Then I should be able to login to application successfully

@LoginTest2
Scenario: Verify whether the user is not able to login with invalid credentials

Given I launch the application
And I navigate to account Login page
When I login to the application using username "apabitwar2016@gmail.com" and password "ap@48824668"
Then I should see an error message that credentials are invalid


@LoginTest3
Scenario: Verify whether the user is not able to login without providing credentials

Given I launch the application
And I navigate to account Login page
When I login to the application using username "" and password ""
Then I should see an error message that credentials are invalid

@LoginTest4
Scenario: Verify whether user is able to reset the forgotten password

Given I launch the application
And I navigate to account Login page
When I reset the forgotten password for email "ashish@gmail.com"
Then I should see message informing the user that information related to resetting have been sent to email address

