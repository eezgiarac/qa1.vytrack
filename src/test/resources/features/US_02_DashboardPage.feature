Feature: As a user, I should access to the Oroinc Documentation page.


  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify that <userType> access to the Oroinc Documentation page by clicking the question mark icon.
    When the user logged in as "<userType>"
    And the user clicks the help link
    And the user switch to next window has title as "Welcome to Oro Documentation"
    Then the user should be able to see url as "https://doc.oroinc.com/"

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |