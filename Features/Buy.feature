Feature: Buy Product

Scenario: Buy Samsung m31 mobile phone
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And User enters valid login userid
	And User Click on Continue
	And User enters valid password
	And User Click on login
	Then validate logged in user
	Then User enter value to Searchbox as "Samsung m31 mobile phone"
	Then User Click on Search button
	Then Page Title should be "Amazon.in : Samsung m31 mobile phone"
	When User Click on Samsung Galaxy M31 (Ocean Blue, 6GB RAM, 128GB Storage)
	Then User on new window with title should be "Samsung Galaxy M31 (Ocean Blue, 6GB RAM, 128GB Storage): Amazon.in: Electronics"
	Then User Click on Buy now button
	Then Page Title should be "Select a Payment Method - Amazon.in Checkout"
	And Close Browser
	