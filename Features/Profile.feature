Feature: Edit Profile

Scenario: Edit Name to Profile
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And User enters valid login userid
	And User Click on Continue
	And User enters valid password
	And User Click on login
	Then validate logged in user
	When User click on Your Account
	Then Page Title should be "Your Account"
	When User Click on Login and Security
	Then Page Title should be "Amazon Change Name, E-mail, Password"
	Then User Click to Edit Name
	Then User enter new name as "Sonal Likhar"
	And User Click on Save Changes button
	Then User should get sucessful message as "Success"
	Then User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And Close Browser
          
	
	