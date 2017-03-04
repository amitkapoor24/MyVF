Feature: 
  As a user
  I want to be able to Login into My vodafone website
 
Scenario Outline: Login into MYVF website using user credentials

	Given the user is on Vodafone page
	When user chooses to sign up
	And user click on login
	And user provides the Login as "<LoginID>"
	And user provides the Password as "<pwd>"
	And user login
	Then user should be logged into My Vodafone  
    Examples:
    | LoginID   | pwd |
    | testuser1 | abc123 |
    | testuser2 | abc123 |
