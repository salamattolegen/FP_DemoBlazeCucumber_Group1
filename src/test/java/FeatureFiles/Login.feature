Feature: Login Functionality
  As a user I want to bi able to login with my valid credentials
  so I can reach my info


  Scenario Outline: Login with username and password
    Given Navigate to DemoBlaze
    When We enter "<userName>" as a username and "<passWord>" as a password
    And Click on Login
    Then Should login successfully
    Examples:
    |userName|passWord|
    |salamattolegen|stolegen123|