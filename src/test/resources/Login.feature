Feature: Validate the login functionality of my fackbook

Background:
# Given user should open the browser and launch the url---due to hooks before annotation

@Sanity
Scenario: validate with invalid username and invalid password
When user should enter invalid username and invalid password
#1D---List 

|Apple|Apple@125|Orange|Orange@456|Grapes|Grapes@6789|lemon|
And user should get the title of the page
And user should get the current url of the page
And user should click login button
Then validate user should navigate to incorrect credential page

@Smoke
Scenario: validate with valid username and invalid password
When you should enter invalid username and the invalid password
#2D---List 

|Apple|Apple@125|Orange  |Orange@456|Grapes|Grapes@6789  |
|logo |App@125  |Orange  |Ora@456   |mango |mango@6789   |
|tv   |tv@125   |washing |fan@456   |light |light@6789   |

And user should click login button

@Regression @Sanity
Scenario: validate with valid username and valid password
When user should enter invalid username field and valid password
#1D---Map 

|Fruit |Apple     |
|Orange|Orange@456|
|Grapes|Grapes@6789|
|lemon  |lem34|
And user should click login button

@Smoke
Scenario: validate with invalid username and invalid password
When user enter Invalid username and Valid password
#2D---Map 

|fruit |Apps |city   |code|street|
|Grapes|lemon|madurai|522 |north |
|mango |shop |trichy |85  |south |
|kiwi  |door |erode  |789 |west  |

And user should click login button

@Regression @Smoke
Scenario Outline: validate with Valid username and Invalid password
When user should enter valid username "<name>" and invalid password"<pass>"
And user should click button
Then validate user should navigate to incorrect credential page


Examples:

|name|pass|
|meenu@546|muthumeenu|
|maha@123|Mahalakshmi123|
