Feature: SauceDemo Site Functionalities

  Scenario: Login with valid credentials
    Given User launches the application
    When User enters valid username and password
    And Clicks on Login button
    Then User should be navigated to homepage

  Scenario: Add product to cart
    Given User is on homepage
    When User clicks on add product to cart
    And Clicks on cart icon
    Then Cart page should be displayed
    
   Scenario: Product checkout
   Given User added product to cart
   When User clicks on checkout button
   Then product added to checkout page
   
   Scenario: User info checkout
   Given User is on checkout page
   When User enter details
   And click on continue button
   Then Checkout overview page displayed
   
   Scenario: User finishes order
   Given User is on overview page
   When User click on finish button
   Then order should get placed
   
