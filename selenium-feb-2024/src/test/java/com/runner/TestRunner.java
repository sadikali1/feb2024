package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = { "com.steps" },
		plugin = {
		"json:target/report/Execution.json", 
		"html:target/report/Execution.html"
		},
		dryRun = false,
		tags = "@DataDriven or @Login")
public class TestRunner {
	

}

