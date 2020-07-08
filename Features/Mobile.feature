Feature: Browse Mobile and Filter Price

Background: Below are common steps for each scenario
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And User enters valid login userid
	And User Click on Continue
	And User enters valid password
	And User Click on login
		@mobile
Scenario: Browse Mobile Phones
	And User Click on Mobile Link
	Then Page Title should be "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"
	Then User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And Close Browser
		@mobile
	Scenario: Select Samsung Mobile Phones
	And User Click on Mobile Link
	Then User Select Samsung brand
	Then User Get Result as "Samsung"
	Then User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And  Close Browser
		@mobile
	Scenario: Filter price for Samsung Mobile Phones Under Thausand
	And User Click on Mobile Link
	Then User Select Samsung brand
	Then User Select Price Under 1000
	Then User Get Filter Result as "Under ₹1,000"
	Then User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And  Close Browser
	
	Scenario: Filter price between thausand to five thausand for mobile
	And User Click on Mobile Link 
	Then User Select Samsung brand
	Then User Select Price between thausand to five thausand
	Then User Get Filter Result as "₹1,000 - ₹5,000"
	When User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And  Close Browser

	Scenario: Filter price Over tewenty thausand for mobile
	And User Click on Mobile Link 
	Then User Select Samsung brand
	Then User Select Price Over tewenty thausand
	Then User Get Filter Result as "Over ₹20,000"
	When User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And  Close Browser
	@mobile
	Scenario: Filter samsung phone having four rating
	And User Click on Mobile Link 
	Then User enter value to Searchbox as "samsung mobile phones"
	Then User Click on Search button
	Then Get all mobile phones having four rating add details in excle
	When User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And  Close Browser
	

	
	