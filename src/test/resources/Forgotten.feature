@Smoke
Feature: Validate the forgotten password functionality
Scenario: validate with Invalid username and Valid password
# Given user should open the chrome and the url---due to hooks before annotation

When user should click the forgotten password link
And user should enter invalid username or password
And user should get the current url of the page
And user should click search button
Then validate user should navigate to password reset page
