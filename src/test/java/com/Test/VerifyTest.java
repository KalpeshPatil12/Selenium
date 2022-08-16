package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class VerifyTest {

	WebDriver driver;
	
	@Test
	public void launchChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Log in to Facebook");
	
	}
	
	@Test
	public void launchFirefoxBrowser() {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	}
	
	@Test
	public void launchEdgeBrowser() {
		
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	
}
