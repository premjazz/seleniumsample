@testing
Feature: TO verify login features

Background: To validate prerequisite
Given User load the application url1
When user enter username and password1


@xxx @yy
Scenario: To verify valid user details
Given User load the application url
When user enter username and password
And user clicks submit buttons
Then user validates sucess message


@xxx
Scenario: To verify valid user details1
Given User load the application url
When user enter username and password
Then user validates sucess message

@xxx  @zzzz
Scenario Outline: To verify valid user details1
Given User load the application url
When user enter username and password as "<user>" "<pass>"
Then user validates sucess message
Examples:
|user|pass|
|admin|adminpassword|
|admin123|adminpass1|






