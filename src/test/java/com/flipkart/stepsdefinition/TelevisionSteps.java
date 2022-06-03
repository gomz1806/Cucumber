package com.flipkart.stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class TelevisionSteps {


   
@When("User search TV")
public void user_search_TV() {
  
	
	WebElement search = MobileSteps.driver.findElement(By.name("q"));
	search.sendKeys("one plus TV");
	MobileSteps.driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@When("user select the TV")
public void user_select_the_TV() {
	
WebElement TvName = MobileSteps.driver.findElement(By.xpath("(//div[contains(text(),'LED Smart Android TV')])[1]"));		
String name = TvName.getText();
System.out.println(name);
TvName.click();
   
}




}
