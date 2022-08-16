package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook1 {
		
		public static void main(String[] args) {
			
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/login/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			System.out.println("Current URL of the page is "+driver.getCurrentUrl());
			
	        String actualURL=driver.getCurrentUrl();
			
			String expectedURL="https://www.facebook.com/login/";
			
			if(actualURL.equals(expectedURL))
			{
				System.out.println("Pass");
			}
			else
			{
			 System.out.println("Failed");
			}
			
			System.out.println("Current Title of the page is "+driver.getTitle());
			
			String actualTitle=driver.getTitle();
			
			String expectedTitle="Log in to Facebook";
			
			if(actualTitle.equals(expectedTitle))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Failed");
			}
			
			driver.close();
			
	}

}
