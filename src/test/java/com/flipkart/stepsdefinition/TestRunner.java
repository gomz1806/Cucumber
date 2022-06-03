package com.flipkart.stepsdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Television.feature",
                   glue    =  "com.flipkart.stepsdefinition",
                   plugin  =  "html:target",
                   monochrome = true,
                   dryRun      = false,
                   tags        = {"@Data","@1dim"})


	
public class TestRunner {
}
