package com.flipkart.stepsdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before : Browser Launch");
		
	}
	
	@After
	public void afterScenario() {
		
		System.out.println("After : Quit Browser");
	}
	
}
