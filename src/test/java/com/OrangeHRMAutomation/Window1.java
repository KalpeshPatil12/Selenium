package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.walmart.com/");
		
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("chair");
		
		driver.findElement(By.xpath("//*[@class=\"ld ld-Search absolute\"]")).click();
		
		System.out.println("The URL of the page is "+driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.walmart.com/search?q=chair");
	
	 
	}

}
