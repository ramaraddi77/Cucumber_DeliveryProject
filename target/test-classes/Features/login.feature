Feature: feature to test login fuctionality

  Scenario Outline: Check login is successful with valid credential
    Given User is on login page
    When User enters username and password
    Then clicks on login button
    And user is navigated to home page

    Examples: 
      | username      |  | password     |
      | standard_user |  | secret_sauce |
      | problem_user  |  | secret_sauce |
      | error_user    |  | secret_sauce |
      | visual_user   |  | secret_sauce |
