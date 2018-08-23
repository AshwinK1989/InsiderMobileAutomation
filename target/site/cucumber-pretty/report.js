$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PharmEasy.feature");
formatter.feature({
  "line": 1,
  "name": "UI Functional Test",
  "description": "",
  "id": "ui-functional-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To test the Dashboard Functionality",
  "description": "",
  "id": "ui-functional-test;to-test-the-dashboard-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Load the Home page",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Load Group Page of Events",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Select the Event",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Favorite the Event",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login into Application",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Check whether the Event is selected as favorite",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Go to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Upload Prescription",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Proceed to Checkout",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefinition.loadTheHomePage()"
});
formatter.result({
  "duration": 10762245988,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.loadEventsPage()"
});
formatter.result({
  "duration": 2111053930,
  "status": "passed"
});
formatter.match({
  "location": "EventPageStepDefinition.selectTheEvent()"
});
formatter.result({
  "duration": 1060926970,
  "status": "passed"
});
formatter.match({
  "location": "EventPageStepDefinition.favoriteTheEvent()"
});
