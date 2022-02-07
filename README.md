# Devsavant Automation Test

This project contains a structure ready to implement automated test cases using Cucumber and Selenium along with the following components:

- JUnit Assert
- Cucumber
- Selenium Webdriver
- Chrome Driver
- java.net.http
- org.json.simple

## Setting up yourself

- You need a personal Gitlab account: https://gitlab.com/users/sign_up
- Make sure you have JDK 11 or newer installed in your environment
- Maven 3.3 or newer is also required
- Once you have cloned the project execute `mvn package` command from project root directory in order for the dependencies to be resolved
- You should have Chrome or Chromium installed in your system
- Follow this guidance in order to install **chromedriver**:
    1. Chromedriver has to match the Chrome/Chromium version in your system. You can download it from: [https://chromedriver.chromium.org/downloads]
    2. Unzip the binary file and place it under `/usr/local/bin`
        - It can be located under any directory that is part of the `$PATH` or the directory should be added to the `$PATH` environment variable
        - `System.setProperty("webdriver.chrome.driver", "path-to-chromedriver");` can also be used as long as chromedriver binary file makes part of your solution. Otherwise your project may not run in other systems.
- Fork this project into your personal account
- Clone the project repository into your local environment
- Create a new branch and name it with your given name and surname using snake case

## Test

### Part 1

1. Go to http://worldtimeapi.org/pages/examples
2. Check how http://worldtimeapi.org/api/timezone endpoint works
    - Define one **negative** scenario that you would test
    - What would you assert?
    - Write that scenario using Gherkin language in `timezone.feature` file
3. Check how http://worldtimeapi.org/api/timezone/America/Bogota endpoint works    
    - Define two **negative** scenarios that you would test
    - What would you assert on each?
    - Write them in your feature file using `Scenario Outline` clause
4. Add a description to the feature file and the scenarios

### Part 2

1. Implement the test steps in `StepDefinitions.java` file
2. All the tests should run and show results when executing `mvn test` command
3. Add a mechanism to run all the tests related with World Time API only
4. Add a mechanism to run only the tests in the `Scenario Outline` clause

### Part 3

1. In a separated feature file create a new test that covers the following user story:
```
As a user, I want to go to Google home page
and type the term "Devsavant" in the search box
and click on the "I'm Feeling Lucky" button
so that I would be taken to the Devsavant's website
```
2. Add a description to the test and to the scenario
3. Implement the test in a separated `*.java` class and use Selenium and chromedriver for the browser automation
4. Implement a screen capture of the browser when the Devsavant website is shown
5. The test should run and show results along with the other tests when executing `mvn test` command
6. Add a mechanism to run only the Devsavant website test

### Challengue

   
- Bautista Gaggiotti - bautistagaggiotti@gmail.com
- For running all the tests within the project, just execute the following command in your terminal: mvn test
- For running the World time API tests only, just execute the following command in your terminal: mvn -Dtest=WorldTimeapi test
- For running the Scenario Outline Tests only, just execute the following command in your terminal: mvn -Dtest=ScenarioOutline test
- For running the Devsavant website Tests only, just execute the following command in your terminal: mvn -Dtest=devsavant test
- Screenshots will be located in the "Screenshots" folder, inside the main directory.
- The chromedriver executable has to be located in /src/test/resources/devsavantautomationtest/chromedriver
- Utils.java file hosts all the methods that are then called from the tests scripts, encapsulating the complexity and specific implementations of the actions that are conducted during those tests.   
    

### Disclaimers
- For the sake of **time** and **practicity**:
    - The repository was migrated to github.
    - Taking into account they are meant to be negative, API tests are based only in content and status codes.
    - Cucumber file contains one test, this being quasi symbolic. 
     



