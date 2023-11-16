Feature: Login to application
	As a customer 


  Scenario: User Want to Login : with Invalid Credentials
    Given I am Testing Case : "<id>"
    And User is arrive to Login Page
    And I have enter username as "sadmin"
    And I have enter password as "Dnow!45"
    When I press the login button
    Then I want to see the error message
    And I want to Close Driver


  Scenario: User Want to Login : with valid credentials
    Given I am Testing Case : "224710"
    And User is arrive to Login Page
    And I have enter username as "sadmin"
    And I have enter password as "Dnow!2345"
    When I press the login button
    Then I verify the login
    And I want to Close Driver

