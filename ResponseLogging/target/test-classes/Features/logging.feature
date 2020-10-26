Feature: Validation of RestAssured Script for Negative Scenario

  Scenario: RestAssured Script for negative scenario
    Given API for foreign Exchange
    When posted with correct Information
    Then validate postive response code received
