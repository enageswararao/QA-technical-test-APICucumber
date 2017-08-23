package com.pressassociation.qa_technical_test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		/*features = "src/test/resources/com/example/features", */
		plugin = {"pretty", "html:target/cucumber-html-report"}
		//glue = " ",
		//tags = "@testdiary"
		)
public class CukesRunnerTest {

}
 
