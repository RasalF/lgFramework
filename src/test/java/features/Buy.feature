Feature: Buy Men's Shoes from Macy's

@hb
  Scenario: Add men's shoes to the cart
    Given I am on the Macy's website
    When I search for "men's shoes"
    And I select a pair of men's shoes
    And I add the selected item to the cart
    Then the item should be in the cart
