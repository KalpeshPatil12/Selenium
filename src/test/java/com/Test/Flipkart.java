package com.Test;

import org.bouncycastle.jce.provider.AnnotatedException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Flipkart {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	}
	
	@Test
	public void getTitle() {
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	
	@Test
	public void getUrl() {
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		Assert.assertEquals(url, "https://www.flipkart.com/");
	}
	
	@Test
	public void getPageSource() {
		
		String page=driver.getPageSource();
		
		System.out.println(page);
	}
	
	@Test
	public void loginPage() {
		
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	}
	
	@Test
	public void search() {
		
        WebElement ele=driver.findElement(By.xpath("//*[@name=\"q\"]"));
		
		ele.sendKeys("chair");
		
		ele.submit();
		
	}
	
	@Test
	public void mobileSearch() {

		driver.findElement(By.xpath("//*[@class=\"_37M3Pb\"]/child::*[1]/following::*[12]")).click();
	}

	/*
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	*/

	
	
}
