Feature: Add and Remove Products

  Scenario Outline: Login with username and password
    Given Navigate to DemoBlaze
    When We enter "<userName>" as a username and "<passWord>" as a password
    And Click on Login
    Then Should login successfully
    Examples:
      |userName|passWord|
      |salamattolegen|stolegen123|

  Scenario: Adding a phone to the cart
    Given Click Phones on the side menu
    When Select a phone
    And Add product to the cart
    And Success message should appear
    Then Click Home


  Scenario: Adding a laptop to the cart
    Given Click on Laptops on the side menu
    When Select a laptop
    And Add product to the cart
    And Success message should appear
    Then Click Home


  Scenario: Adding a monitor to the cart
    Given Click on Monitors on the side menu
    When Select a monitor
    And Add product to the cart
    And Success message should appear
    When Go to the cart
    And Remove monitor from the cart
    Then Assert product removal
    Then Click Home


  Scenario: Adding a product using next button on the right corner
    Given Click next button on the right corner
    When Select a different monitor
    And Add product to the cart
    Then Success message should appear


  Scenario: Assert Total is correct and Place Order
    Given Go to the cart
    Then Assert that Total is correct
    When Click Place order
    And Fill the form and click purchase
    And Assert an ID is assigned. Assert Amount, Card number, Name and Date are correct
    Then Click OK.