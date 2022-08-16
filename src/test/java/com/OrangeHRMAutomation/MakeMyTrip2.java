package com.OrangeHRMAutomation;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip2 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		
		System.out.println("The title of the WebPage is:- "+driver.getTitle());
		
		System.out.println("The URL of the page is:- "+driver.getCurrentUrl());
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Title: ");
		
		String expectedTitle=s.nextLine();
		
		System.out.println("Title: "+expectedTitle);
		
		String actualTitle=driver.getTitle();
		
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
