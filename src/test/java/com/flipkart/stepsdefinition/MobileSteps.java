package com.flipkart.stepsdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileSteps {
	
static WebDriver  driver;
	
	@Given("User launches flipkart application")
public void user_launches_flipkart_application() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@Given("User login flipkart by using credentials")
public void user_login_flipkart_by_using_credentials() {
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();;
	System.out.println("Login Not Required");

}
   
@When("User search mobiles")
public void user_search_mobiles() {
  
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("realme");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@When("user select the mobile")
public void user_select_the_mobile() {
	
WebElement mobilename = driver.findElement(By.xpath("(//div[contains(text(),'realme ')])[1]"));		
String name = mobilename.getText();
System.out.println(name);
mobilename.click();
   
}

@When("User navigates into new window and click on add to cart")
public void user_navigates_into_new_window_and_click_on_add_to_cart() {
    
	String Allwin = driver.getWindowHandle();
	
	Set<String> window = driver.getWindowHandles();
	for (String WH : window) {
		
		if (!WH.equals(Allwin)) {
			driver.switchTo().window(WH);
			System.out.println("Window Switched");
		}
	}
	
}

@Then("user validate the cart page")
public void user_validate_the_cart_page() {
	
	WebElement AddCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
    AddCart.click();


}
@When("User search mobiles by using one dim list")
public void user_search_mobiles_by_using_one_dim_list(DataTable dataTable) {

	List<String> asList = dataTable.asList();
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys(asList.get(1));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@When("User search mobiles by using one dim Map")
public void user_search_mobiles_by_using_one_dim_Map(DataTable dataTable) {
  
   Map<String, String> asMap = dataTable.asMap(String.class, String.class);
  
   	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys(asMap.get("Phone1"));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
   
}

	@When("User search mobiles {string}")
	public void user_search_mobiles(String Phone) {

		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(Phone);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
	}
	}


