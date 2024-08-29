##  Test Automation test Framework using BDD

Behaviour Driven Development test automaton framework for assessment

-- In this test framework I used below tech stacks --
* Cucumber - test layer
* Java - primary language

###### Prerequisites:
* Java 11
* Maven > 3.8.1


### Framework Structure:
* Config.properties
  * Browser - firefox or chrome
  * Url
  * Headless - True or false
  * username and password

* Utility
  * testBase  - properties
  * baseClass - browser configuration
  * Constants - variables.

* Pages
  * locators and functions and logics

* Steps
  * step definitions

* assessment.feature
  * Test case 1: Positive test (valid username and password)
  * Test case 2: Negative username test (incorrect username and valid password)
  * Test case 3: Negative password test (valid username and incorrect password)
  * Test case 4: Empty username and password

### How to Execute:
* Navigate to assessment.Feature -> Right-Click on the feature file -> click Run or Click Play / Run button near the Scenarios.

### Parallel Execution ###
* open maven and enter mvn test -DsuiteXmlFile=testng.xml (through this command parallel execution will be executed)