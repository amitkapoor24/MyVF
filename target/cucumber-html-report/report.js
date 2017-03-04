$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a user\r\nI want to be able to Login into My vodafone website",
  "id": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login into MYVF website using user credentials",
  "description": "",
  "id": ";login-into-myvf-website-using-user-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "the user is on Vodafone page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user chooses to sign up",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user click on login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user provides the Login as \"\u003cLoginID\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user provides the Password as \"\u003cpwd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged into My Vodafone",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": ";login-into-myvf-website-using-user-credentials;",
  "rows": [
    {
      "cells": [
        "LoginID",
        "pwd"
      ],
      "line": 15,
      "id": ";login-into-myvf-website-using-user-credentials;;1"
    },
    {
      "cells": [
        "testuser1",
        "abc123"
      ],
      "line": 16,
      "id": ";login-into-myvf-website-using-user-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3730260233,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login into MYVF website using user credentials",
  "description": "",
  "id": ";login-into-myvf-website-using-user-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "the user is on Vodafone page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user chooses to sign up",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user click on login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user provides the Login as \"testuser1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user provides the Password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged into My Vodafone",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_on_Vodafone_page()"
});
formatter.result({
  "duration": 6652930193,
  "status": "passed"
});
formatter.match({
  "location": "MyVFPageSteps.user_chooses_to_sign_up()"
});
formatter.result({
  "duration": 2945655744,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_login()"
});
formatter.result({
  "duration": 2093179682,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser1",
      "offset": 28
    }
  ],
  "location": "LoginPageSteps.user_provides_the_Login_as(String)"
});
formatter.result({
  "duration": 466554550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 31
    }
  ],
  "location": "LoginPageSteps.user_provides_the_Password_as(String)"
});
formatter.result({
  "duration": 94198574,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_login()"
});
formatter.result({
  "duration": 921820587,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_should_be_logged_into_My_Vodafone()"
});
formatter.result({
  "duration": 210307417,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat Pages.LoginPage.user_should_be_logged_into_My_Vodafone(LoginPage.java:50)\r\n\tat vodafone.myvf.steps.LoginPageSteps.user_should_be_logged_into_My_Vodafone(LoginPageSteps.java:40)\r\n\tat ✽.Then user should be logged into My Vodafone(features/login.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1087416337,
  "status": "passed"
});
});