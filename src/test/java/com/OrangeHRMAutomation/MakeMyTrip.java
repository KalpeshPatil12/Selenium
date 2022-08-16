package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		
		System.out.println("The title of the WebPage is:- "+driver.getTitle());
		
		System.out.println("The URL of the page is:- "+driver.getCurrentUrl());
		
		String actualTitle=driver.getTitle();
		
		String expectedTitle="Make My Trip";
		
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
