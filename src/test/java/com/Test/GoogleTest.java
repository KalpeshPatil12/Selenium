package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1,groups="getTitleTest")
	public void getTitleTest() {
		
		System.out.println("The title of the page is "+driver.getTitle());
	}
	
	@Test(priority=2,groups="googleLogo")
	public void googleLogo() {
		
		boolean b=driver.findElement(By.xpath("//*[@class=\"lnXdpd\"]")).isDisplayed();
		
	}
	
	@Test(priority=3,groups="mailLinkTest")
	public void mailLinkTest() {
		
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		
		System.out.println("Test3");
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
