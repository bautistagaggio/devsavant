package devsavantautomationtest;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("devsavant-automation-test")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class RunCucumberTest 
{

@Given("user hits endpoint")
public void establishConnection() 
{
    System.out.println("Connection with the server is being established");

}

@When("provides invalid url")
public void userInput() 
{
    System.out.println("User input is being evaluated");

}
@Then("a client message 'Not found' will show up")
public void GetResponseContent() 
{
    System.out.println("Retrieving response content");

}

@And("the http code error will be a 404")
public void GetResponseCode() 
{
    System.out.println("Retrieving response code");

}

}
