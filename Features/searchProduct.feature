Feature: searching products

Scenario Outline: searching products in google


Given i am at the google homepage

When i entered "<product_name>" in the search bar
And i click the search button

Then i can see the result successfully 

Examples:
 | product_name |
 | tesla model y|
 | iphone 15 pro|
