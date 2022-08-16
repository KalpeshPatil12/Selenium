package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MakeMyTrip1 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		
		System.out.println("The title of the WebPage is:- "+driver.getTitle());
		
		System.out.println("The URL of the page is:- "+driver.getCurrentUrl());
		
		if(driver.getTitle().equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
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
