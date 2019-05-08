Feature: Create account on Facebook


Scenario: validate first name field
Given User need to be a facebook login page
When User enters user first name
Then User checks user first name is present
Then close browser





Scenario: validate create user multiple fields
Given user need to be a facebook login page
When User enters user first name
And enters the surname
Then User checks user first name is present
Then User mobile field should be blank
Then close browser
