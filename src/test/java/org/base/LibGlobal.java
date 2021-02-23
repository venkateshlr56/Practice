package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	static WebDriver driver;
	
public static WebDriver getDriver() {
		
		WebDriverManager.chromedriver().setup();
		
	return	driver=new ChromeDriver();
		
		
	}
	public static void loadUrl(String url) {
		
		driver.get(url);

	}
	
	public static void pageUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void maximizeWindow() {
		
		driver.manage().window().maximize();
		
	}
	
	public static void type(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	public static void btnClick(WebElement element) {
		element.click();
		
	}
	
	
}
