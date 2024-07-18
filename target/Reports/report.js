$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Forgotten.feature");
formatter.feature({
  "name": "Validate the forgotten password functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "validate with Invalid username and Valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should click the forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "ForgottonStep.user_should_click_the_forgotten_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter invalid username or password",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottonStep.user_should_enter_invalid_username_or_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the current url of the page",
  "keyword": "And "
});
formatter.match({
  "location": "Loginstep.user_should_get_the_current_url_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottonStep.user_should_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate user should navigate to password reset page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgottonStep.validate_user_should_navigate_to_password_reset_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.StepDefinition.ForgottonStep.validate_user_should_navigate_to_password_reset_page(ForgottonStep.java:42)\r\n\tat ✽.validate user should navigate to password reset page(file:src/test/resources/Forgotten.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});