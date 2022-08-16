package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleTitleTest {
	   
	    WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		
		@Test
		public void getTitleTest() {
			
			String title=driver.getTitle();
			
            System.out.println(title);
			
			Assert.assertEquals(title, "Google");
		}
		

		@Test
		public void googleLogo() {
			
			boolean b=driver.findElement(By.xpath("//*[@class=\"lnXdpd\"]")).isDisplayed();
			
			Assert.assertTrue(b);
			
		}
		
		@AfterMethod
		public void tearDown() {
			
			driver.quit();
		}
		
}
