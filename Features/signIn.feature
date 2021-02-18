Feature: Log in

Scenario: User can Log in with valid credentials
	Given User launch Chrome browser
	When User browse URL "https://admin-demo.nopcommerce.com/login"
	Then User enters Email as "admin@yourstore.com" and Password as "admin"
	And User click on Login
	Then Page title should be "Dashboard / nopCommerce administration"
	Then User click on log out link
	Then Page title should be "Your store. Login"
	And close browser


