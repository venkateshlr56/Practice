package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.LibGlobal;
import org.locators.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends LibGlobal {
	
	@Given("User is on Facebook login page")
	public void userIsOnFacebookLoginPage() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User should enter the valid username and password")
	public void userShouldEnterTheValidUsernameAndPassword() {
		
		//1d wthout header
		
//		List<String> asList = dataTable.asList();
//		String string = asList.get(0);
//		System.out.println(string);
		
		//1d wth header
		
//		Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);
//		Object object = asMap.get("username");
//		System.out.println(object);
		
		//2d wthout header
//		List<List<String>> asLists = dataTable.asLists();
//		String string = asLists.get(0).get(1);
//		System.out.println(string);
//	
		//2d wth header
//		List<Map<String, String>> asMaps = dataTable.asMaps();
//		String string = asMaps.get(0).get("username");
//		System.out.println(string);
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@When("User Should click the login button")
	public void userShouldClickTheLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("User should land to Facebook homepage after providig valid username and password")
	public void userShouldLandToFacebookHomepageAfterProvidigValidUsernameAndPassword() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
	
//	LoginPojo login;
//	public WebDriver driver;
//	
//	@Given("User is on Facebook login page")
//	public void user_is_on_Facebook_login_page() {
//		
//		getDriver();
//		
//		loadUrl("https://www.facebook.com/");
//		
////		WebDriverManager.chromedriver().setup();
////	    driver=new ChromeDriver();
////	    driver.get("https://www.facebook.com/");
////	    driver.manage().window().maximize();
//	}
//	
//	@When("User should enter the valid {string} and {string}")
//	public void user_should_enter_the_valid_and(String string, String string2) {
//		
//		login=new LoginPojo();
//		type(login.getTxtEmail(),string);
//		type(login.getTxtPass(), string2);
////		 driver.findElement(By.id("email")).sendKeys(string);
////		 driver.findElement(By.id("pass")).sendKeys(string2);
//	}
//
//	@When("User Should click the login button")
//	public void user_Should_click_the_login_button() {
//		
//		btnClick(login.getBtnLogin());
//	   
////		driver.findElement(By.id("u_0_b")).click();
//	}
//
//	@Then("User should land to Facebook homepage after providig valid username and password")
//	public void user_should_land_to_Facebook_homepage_after_providig_valid_username_and_password() {
//	    System.out.println("Successfully logged in using valid username and password");
//	}
}
