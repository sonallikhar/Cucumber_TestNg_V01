Feature: Login

@test
Scenario Outline: Successful Login with valid credentials
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And  User enters valid login input as "<userid>"
	And User Click on Continue
	And User enters Password as "<password>"
	And User Click on login
	Then validate logged in user
	Then User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And Close Browser
	
	Examples:
	| userid | password |
	| 9892674768 | Sonal1 |
	@test
	Scenario: Invalid Blank login userid credential
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And User Click on Continue
	Then Error message should be displayed as "Enter your email or mobile phone number"
	And Close Browser
	@test
	Scenario: Invalid Blank login password credential
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And User enters valid login userid
	And User Click on Continue
	And User Click on login
	Then Error message for password displayed as "Enter your password"
	And Close Browser
	@test
	Scenario: Invalid login userid credential
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And User enters invalid login userid
	And User Click on Continue
	Then Error message for not registered userid should be displayed as "We cannot find an account with that email address"
	And Close Browser
	@test
	Scenario: Invalid login password credential
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And User enters valid login userid
	And User Click on Continue
	And  User enters invalid login password
	And User Click on login
	Then Error message getting as your password is incorrect
	And Close Browser