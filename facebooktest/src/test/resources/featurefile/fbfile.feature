Feature: Login page to Facebook

      @scenario1
  Scenario: Error message validation in Facebook application
    Given User navigates to facebook application via chromebrowser
    When user inputs the username "username" and password "gneesky"
    And user clicks on login button
    Then user validates the error message