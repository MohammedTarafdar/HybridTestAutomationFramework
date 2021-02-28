Feature: Customer

Scenario: Add new customer
	Given User launch Chrome browser
	When User browse URL "https://admin-demo.nopcommerce.com/login"
	Then User enters Email as "admin@yourstore.com" and Password as "admin"
	And User click on Login
	Then User can view Dashboard
	When User click on customers menu
	Then User click on customer menu item
	And User click on add new button
	Then User can view Add New Customer page
	When User enter customer info
	And User click on Save button
	Then User can view confirmation message "The new customer has been added successfully."
	And close browser