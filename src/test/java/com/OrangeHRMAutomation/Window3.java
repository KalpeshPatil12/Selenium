package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("chair");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		System.out.println("The URL of the page is "+driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.in/s?k=chair&ref=nb_sb_noss");
		
		driver.quit();

	}

}
