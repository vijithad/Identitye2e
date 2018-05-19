$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/identity/e2e/cuke/GetVehicles.feature");
formatter.feature({
  "line": 2,
  "name": "Get Vehicles",
  "description": "",
  "id": "get-vehicles",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3315114005,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Get Vehicles should not read the txt files",
  "description": "",
  "id": "get-vehicles;get-vehicles-should-not-read-the-txt-files",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "there are 4 xslx files and 6 csv files and a txt file containing 5 vehicles each",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "get vehicles is called",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "only 50 vehicles are returned",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 10
    },
    {
      "val": "6",
      "offset": 27
    },
    {
      "val": "5",
      "offset": 65
    }
  ],
  "location": "StepDefs.there_are_xslx_files_and_csv_files_and_a_txt_file_containing_vehicles_each(int,int,int)"
});
formatter.result({
  "duration": 161822661,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.get_vehicles_is_called()"
});
formatter.result({
  "duration": 100563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 5
    }
  ],
  "location": "StepDefs.only_vehicles_are_returned(int)"
});
formatter.result({
  "duration": 136818,
  "status": "passed"
});
formatter.after({
  "duration": 86143653,
  "status": "passed"
});
formatter.uri("com/identity/e2e/cuke/VerifyVehicleRegistrationDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Verify List of Vehicle Registration Details from DVLA",
  "description": "",
  "id": "verify-list-of-vehicle-registration-details-from-dvla",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2074794188,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Succesful Vehicle Registration Details",
  "description": "",
  "id": "verify-list-of-vehicle-registration-details-from-dvla;succesful-vehicle-registration-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open DVLA Vehicle View website",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "I click on StartNow Link",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I Enter Vehicle Registration Number and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I verify details on Vehicle Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "GetVehicleInformationSteps.getVehicleInformationPage()"
});
formatter.result({
  "duration": 1105441219,
  "status": "passed"
});
formatter.match({
  "location": "GetVehicleInformationSteps.i_click_on_StartNow_Link()"
});
formatter.result({
  "duration": 744916321,
  "status": "passed"
});
formatter.match({
  "location": "GetVehicleInformationSteps.i_Enter_Vehicle_Registration_Number_and_proceed()"
});
formatter.result({
  "duration": 1049686083,
  "status": "passed"
});
formatter.match({
  "location": "VerifyVehicleDetailsSteps.i_verify_details_on_Vehicle_Details_page()"
});
formatter.result({
  "duration": 31043937,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//form[@action\u003d\u0027/ConfirmVehicle\u0027]//input[@id\u003d\u0027Vrm\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.38.552518 (183d19265345f54ce39cbb94cf81ba5f15905011),platform\u003dMac OS X 10.13.4 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u002715MBP-13042\u0027, ip: \u0027fe80:0:0:0:14a4:1397:bfa7:1120%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.4\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552518 (183d19265345f5..., userDataDir: /var/folders/d8/f2c5km114mz...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: 5a9e78d44b8a43fd65f0dc86511def39\n*** Element info: {Using\u003dxpath, value\u003d//form[@action\u003d\u0027/ConfirmVehicle\u0027]//input[@id\u003d\u0027Vrm\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy88.sendKeys(Unknown Source)\n\tat com.identity.e2e.cuke.VerifyVehicleDetailsSteps.i_verify_details_on_Vehicle_Details_page(VerifyVehicleDetailsSteps.java:17)\n\tat ✽.Then I verify details on Vehicle Details page(com/identity/e2e/cuke/VerifyVehicleRegistrationDetails.feature:6)\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://vehicleenquiry.service.gov.uk/ConfirmVehicle");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1238941820,
  "status": "passed"
});
});