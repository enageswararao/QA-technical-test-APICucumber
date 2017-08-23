package com.pressassociation.qa_technical_test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionTest {
 
	
	@Given("^Create a Video API \"([a-zA-Z]{1,})\"$")
	public void i_have_the_current_testdiary_url(String baseURL ) throws Throwable {
	  
		System.out.println("my current url is: " +baseURL );
	}

	@When("^The user makes a request with the header \"([a-zA-Z]{1,})\"$")
	public void i_open_the_testdiary_url(String headerParamer) throws Throwable {
		System.out.println("my current url is: "+ headerParamer );

	}

	@Then("^The user validates the response with the \"([a-zA-Z]{1,})\"$")
	public void testdiary_should_be_displayed1(String exceptedResponse) throws Throwable {
		System.out.println("my current url is: "  +exceptedResponse);
		
	}
	
	@Then("^The user receives the status \"([a-zA-Z]{1,})\" for the response$")
	public void testdemo(String  responseCode){
		
		System.out.println("test"+responseCode);
	}
}
 
