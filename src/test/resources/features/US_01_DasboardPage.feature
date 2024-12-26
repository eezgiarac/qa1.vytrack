Feature: As a user, I should be accessing all the main modules of the app


  Background: User is already in the log in page
    Given the user is on the login page
  @test
  Scenario Outline: Verify that <userType>s see 8 module names
    When the user logged in as "<userType>"
    Then the user should be able to see "Dashboards,Fleet,Customers,Sales,Activities,Marketing,Reports & Segments,System"

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |


  Scenario: Verify that Drivers see 4 module names
    When the user logged in as "driver"
    Then the user should be able to see "Fleet,Customers,Activities,System"




