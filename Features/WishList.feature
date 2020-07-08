Feature: Add item from wish list back to cart
Scenario Outline: Add item from wish list back to cart
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Signin button
	Then Page Title should be "Amazon Sign In"
	And  User enters valid login input as "<userid>"
	And User Click on Continue
	And User enters Password as "<password>"
	And User Click on login
	Then validate logged in user
	Then User enter value to Searchbox as "Samsung Galaxy A31 (Prism Crush Blue, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers"
	Then User Click on Search button
	Then Page Title should be "Amazon.in : Samsung Galaxy A31 (Prism Crush Blue, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers"
	When User Click on Samsung Galaxy M31 (Ocean Blue, 6GB RAM, 128GB Storage)
	Then User on new window with title should be "Samsung Galaxy A31 (Prism Crush Blue, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers: Amazon.in: Electronics"
	Then User Click on Add to Wish List
	Then User Click view Wish List
	Then User Click on Add to Cart
	Then User get message as "Added to Cart"
	Then User click on Cart
	Then User Validate Samsung Galaxy A31 (Prism Crush Blue, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers displayed into cart
	Then User Click on Logout
	Then Page Title should be "Amazon Sign In"
	And Close Browser
	
	Examples:
	| userid | password |
	| 9892674768 | Sonal1 |