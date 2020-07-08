Feature: Cart Feature

	Scenario: Add ten product into cart remove eight add 2 more
	Given User Launch browser
	Then Page Title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	Then User Click on Mobile Link
	Then User Select Samsung brand
	Then User added ten phones to cart
	Then User click on Cart
	Then Page Title should be "Amazon.in Shopping Cart"
	Then User Added mobile on first two mobile phones
	Then User Deleted remaining eight mobile phones
	And Close Browser
	