package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EBanking {
	
	WebDriver driver;
	
//	@BeforeTest
//	public void launchBrowser() {
//		
//		System.out.println("@BeforeTest - Launch Browser");
//	}  
//	
//	@BeforeClass
//	public void login() {
//		
//		System.out.println("@BeforeClass - Login to app");
//	}
//	
//	@BeforeMethod
//	public void enterURL() {
//		
//		System.out.println("@BeforeMethod - Enter URL");
//	}
//	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
        driver.findElement(By.name("uid")).sendKeys("mngr416398");
		driver.findElement(By.name("password")).sendKeys("tAgEmuz");
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
//	@Test
//	public void loginTestCase() throws InterruptedException {
//
//		driver.findElement(By.name("uid")).sendKeys("mngr416398");
//		
//		driver.findElement(By.name("password")).sendKeys("tAgEmuz");
//		
//		driver.findElement(By.name("btnLogin")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@class=\"menusubnav\"]/child::*[2]/child::*")).click();
//		
//		driver.findElement(By.name("name")).sendKeys("Ram");
//	}
	
	@Test
	public void addCust() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@class=\"menusubnav\"]/child::*[2]/child::*")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).sendKeys("Ram");
		
		driver.findElement(By.name("rad1")).click();
		
		driver.findElement(By.name("addr")).sendKeys("INDIA");
		
		driver.findElement(By.name("city")).sendKeys("Jalgaon");
		
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		
		driver.findElement(By.name("pinno")).sendKeys("424210");
		
		driver.findElement(By.name("telephoneno")).sendKeys("853210");
		
		driver.findElement(By.name("emailid")).sendKeys("kahhdjd@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("55455");
		
		driver.findElement(By.name("sub")).click();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
