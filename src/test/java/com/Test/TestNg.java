package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("@BeforeSuite - SetUp system property from chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		
		System.out.println("@BeforeTest - Launch Browser");
	}  
	
	@BeforeClass
	public void login() {
		
		System.out.println("@BeforeClass - Login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		
		System.out.println("@BeforeMethod - Enter URL");
	}
	
	@Test
	public void googleTitle() {
		
		System.out.println("@Test - Enter google Title");
	}
	
	@Test
	public void searchTest() {
		
		System.out.println("@Test - Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		
		System.out.println("@Test - Google logo Test");
	}
	
	@AfterMethod
	public void logOut() {
		
		System.out.println("@AfterMethod  - Log Out");
	}
	
	@AfterClass
	public void closeBrowser() {
		
		System.out.println("@AfterClass - Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		
		System.out.println("@AfterTest - Delete all cookies");
	}
	

}
