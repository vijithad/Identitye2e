# Identitye2e

`./gradlew clean build` - to run unit tests and cucumber tests

`./gradlew clean test --tests com.identity.e2e.cuke.RunCucumberTests` to run only cucumber tests

`./gradlew bootRun` - to start the web application

Cucumber report can be found at `Identitye2e/output/index.html`

Executable files when committed to git sometimes don't work as expected.
Download the driver (on macOs it's chromedriver) to the root of this folder from https://chromedriver.storage.googleapis.com/index.html?path=2.38/ 