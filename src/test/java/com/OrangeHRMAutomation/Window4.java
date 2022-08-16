package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement ele=driver.findElement(By.xpath("//*[@name=\"q\"]"));
		
		ele.sendKeys("chair");
		
		ele.submit();
		
		System.out.println("The URL of the page is "+driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.flipkart.com/search?q=chair&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		
		driver.quit();


	}

}
