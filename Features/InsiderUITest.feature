Feature: UI Functional Test

  Scenario: To test the Dashboard Functionality
    And Load the Home page
    And Load Group Page of Events
    And Select the Event
    And Favorite the Event
    And Login into Application
    Then Check whether the Event is selected as favorite
    And Go to Cart
    And Click on Continue
    And Upload Prescription
    And Click on Proceed to Checkout