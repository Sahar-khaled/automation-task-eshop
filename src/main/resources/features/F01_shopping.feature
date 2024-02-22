@regression
Feature: Adding items to the cart on eshop.vodafone.com.eg

  Scenario: Add items to the cart
    Given I am on the eshop page firstly cancel cookies card
    When Click on one of the menu items
    And I select the first item.
    And and add it to the cart
    And navigate to previous page
    And add the second item to the cart
    And click on the add to cart button again
    And search for the third item
    Then add the third item to the cart

