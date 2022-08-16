package com.OrangeHRMAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTc {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://chrome.com");
	
		driver.navigate().back();
	
		System.out.println("Page 1 Title :"+driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println("Page 2 title:"+driver.getTitle());
		
		System.out.println("Title of the google page is :"+driver.getTitle());
		
		if(driver.getTitle().equals("Google"))
		{ System.out.println("Successfully validate the Title of the chrom page");
		}
		else
		{ 
			System.out.println("Failed to validaate the Title of the chrom page");
		}
		
	/*
		catch(Exception e) {
		e.printStackTrace();
		}
		
		/*
		finally {

		}
		 */
		
		}
	
}
