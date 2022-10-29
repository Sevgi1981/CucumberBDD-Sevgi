Feature: Payment Gateway functional test

  @BuyingProduct_TC1 @BuyingProduct @Regression @Smoke
  Scenario: Verify that user can buy a product
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy an elephant toy
    Then The user wants to provide payment information
    And The user wants to click on pay now
    Then The user wants to verify message is successful

    #First step is go to website
    #Second step is choose quantity and click on buy now button
    #Third step we will provide all required information
    #Fourth step - we will verify if we can see success message

  @BuyingProduct_TC2 @BuyingProduct @Regression
  Scenario: Verify that user can buy multiple products
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter Credit Card Number as "5454545454545454"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiration Year as "2025"
    And The user wants to enter CVV Code as "177"
    And The user wants to click on pay now
    Then The user wants to verify message as "Payment successfull!"


    @dryRunTest @Regression
  Scenario: Verify that user can buy multiple products
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter Credit Card Number as "5454545454545454"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiration Year as "2025"
    And The user wants to enter CVV Code as "177"
    And The user wants to click on pay now
      Then The user wants to verify message as "Payment successfull!"

      @TC_600
  Scenario: Verify that user can buy multiple products - Using Map
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to provide enter payment information as following
    |CNumber |5454545454545454|
    |EMonth  | 11             |
    |EYear   | 2025           |
    |CvvCode | 177            |
    And The user wants to click on pay now
    Then The user wants to verify message as "Payment successfull!"

     @TC_700
  Scenario: Verify that user can buy multiple products - Using List
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as following quantity
    | 5 |
    |9 |
    | -0|
    Then The user wants to provide enter payment information as following as a List
    |5454545454545454 | 11 |  2025 | 177 |
    |4520123412312222 | 12 |  2022 | 199 |
    And The user wants to click on pay now
    Then The user wants to verify message as "Payment successfull!"





