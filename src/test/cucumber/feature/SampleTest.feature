Feature: Proof Of Concept test for Rackroom
We will demonstrate how to automate
and time actions

Scenario: I add two products to the cart
Given I have navigated to the home page
When I search for the text KJ890PDP
Then I Locate the link in the search results
Then I Select the product
Then I select the first size
Then I add to cart
Then I navigate to the PDP of 751302
Then I select the second size
Then I add to cart
Then I navigate to cart
