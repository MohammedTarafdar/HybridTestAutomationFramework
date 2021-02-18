package com.name.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//Features/signIn.feature",
		glue = "com.name.stepDefinitions",
		dryRun = false,
		monochrome = true,
		publish = true,
		plugin = {"pretty", "html:test-output"}
		
		)

public class TestRun {

}
