Feature: New Customer

Scenario: Register New Customer
Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then User Click on Create your Amazon account
	Then Page Title should be "Amazon Registration"
	Then User Enter username as "Testing"
	Then User Enter Mobile number as "9867566767"
	Then User Enter Email as "testingh@test.com"
	Then User Enter Password as "Testing1234"
	Then User Click on Continue
	Then Page Title should be "Amazon Phone Verification"
	And Close Browser
	
        