$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Successful Login with valid credentials",
  "description": "",
  "id": "login;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Page Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enters valid login input as \"\u003cuserid\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Click on login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate logged in user",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userid",
        "password"
      ],
      "line": 19,
      "id": "login;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "9892674768",
        "Sonal1"
      ],
      "line": 20,
      "id": "login;successful-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Successful Login with valid credentials",
  "description": "",
  "id": "login;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Page Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enters valid login input as \"9892674768\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters Password as \"Sonal1\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Click on login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate logged in user",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_browser()"
});
formatter.result({
  "duration": 31385561224,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 1365104695,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Signin_button()"
});
formatter.result({
  "duration": 2096577496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Sign In",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 1917755515,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9892674768",
      "offset": 34
    }
  ],
  "location": "Steps.user_enters_valid_login_input_as(String)"
});
formatter.result({
  "duration": 235924315,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Continue()"
});
formatter.result({
  "duration": 175521958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sonal1",
      "offset": 25
    }
  ],
  "location": "Steps.user_enters_Password_as(String)"
});
formatter.result({
  "duration": 1865417982,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_login()"
});
formatter.result({
  "duration": 7700207620,
  "status": "passed"
});
formatter.match({
  "location": "Steps.validate_logged_in_user()"
});
formatter.result({
  "duration": 187667824,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Logout()"
});
formatter.result({
  "duration": 2176315195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Sign In",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 720220855,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "duration": 6147383783,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Invalid Blank login userid credential",
  "description": "",
  "id": "login;invalid-blank-login-userid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Page Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Error message should be displayed as \"Enter your email or mobile phone number\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_browser()"
});
formatter.result({
  "duration": 14897907965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 1958902195,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Signin_button()"
});
formatter.result({
  "duration": 1874654822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Sign In",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 399948975,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Continue()"
});
formatter.result({
  "duration": 1000696465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter your email or mobile phone number",
      "offset": 38
    }
  ],
  "location": "Steps.error_message_should_be_displayed_as(String)"
});
formatter.result({
  "duration": 441917240,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "duration": 2774595977,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Invalid Blank login password credential",
  "description": "",
  "id": "login;invalid-blank-login-password-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Page Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User Click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User enters valid login userid",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Click on login",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Error message for password displayed as \"Enter your password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_browser()"
});
formatter.result({
  "duration": 20128376391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 960368926,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Signin_button()"
});
formatter.result({
  "duration": 1230525120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Sign In",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 1491840848,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enters_valid_login_userid()"
});
formatter.result({
  "duration": 252052984,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Continue()"
});
formatter.result({
  "duration": 1318878950,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_login()"
});
formatter.result({
  "duration": 205024227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter your password",
      "offset": 41
    }
  ],
  "location": "Steps.error_message_for_password_displayed_as(String)"
});
formatter.result({
  "duration": 536994769,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "duration": 2731368210,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Invalid login userid credential",
  "description": "",
  "id": "login;invalid-login-userid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "User Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "Page Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User Click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User enters invalid login userid",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Error message for not registered userid should be displayed as \"We cannot find an account with that email address\"",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_browser()"
});
formatter.result({
  "duration": 15547368437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 1521600198,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Signin_button()"
});
formatter.result({
  "duration": 6745568282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Sign In",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 884897505,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enters_invalid_login_userid()"
});
formatter.result({
  "duration": 185091147,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Continue()"
});
formatter.result({
  "duration": 3040210240,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We cannot find an account with that email address",
      "offset": 64
    }
  ],
  "location": "Steps.error_message_for_not_registered_userid_should_be_displayed_as(String)"
});
formatter.result({
  "duration": 1051150366,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "duration": 25936149529,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Invalid login password credential",
  "description": "",
  "id": "login;invalid-login-password-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "Page Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "User Click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Page Title should be \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User enters valid login userid",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "User Click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User enters invalid login password",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User Click on login",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "Error message getting as your password is incorrect",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_browser()"
});
formatter.result({
  "duration": 6266387951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 359792008,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP\u0027, ip: \u0027192.168.1.207\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Sonal\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50878}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 36a5aa524c10479f81c5c1392aaac267\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat pageObjectpackage.HomePage.verifyHomePageTitle(HomePage.java:86)\r\n\tat stepdefinitions.Steps.page_Title_should_be(Steps.java:35)\r\n\tat ✽.Then Page Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"(Login.feature:54)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.user_Click_on_Signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Sign In",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_enters_valid_login_userid()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_Click_on_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_enters_invalid_login_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_Click_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.error_message_getting_as_your_password_is_incorrect()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});