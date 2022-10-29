Feature: This feature is about login functionality of Amazon
  #This is how we comment on feature files
  #Gherkin language
  # Given, When, Then, And, But
  #Testrail and Zephyr Scale are two test case management tools. We dont need to use them if we use a cucumberBDD framework
  #BDD - Behaviour Driven Development
  #Reusability
  #Readability

  #This is a positive scenario / happy path

  Scenario: Login to Amazon with Correct Username and Correct Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter correct username
    Then The user wants to enter correct password
    And The user wants to click on login button

    #This is a negative scenario
  Scenario: Login to Amazon with Correct Username and Incorrect Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter correct username
    Then The user wants to enter incorrect password
    And The user wants to click on login button
    And The user wants to verify that login was unsuccessful


    #This is a negative scenario
  Scenario: Login to Amazon with Incorrect Username and Correct Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter Incorrect Username
    Then The user wants to enter Correct Password
    And The user wants to click on login button
    And The user wants to verify that login was unsuccessful

