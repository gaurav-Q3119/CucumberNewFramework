Feature: Automated End2End Tests
Description; The purpose of this feature is to test End2End intergration

Scenario: Customer place an order by purchasing an item from purchasing from search
	Given User is on Home page
	When he search for "dress"
	And choose to buy the first item
	And moves to chekout from mini cart
	And enter personal details checkout page
	And select same delivery address
	And select payment method  as "check" payment
	And place the order