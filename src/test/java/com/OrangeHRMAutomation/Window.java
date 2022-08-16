package com.OrangeHRMAutomation;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
	
		System.out.println("The URL of the page is:- "+driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/s?k=phone&ref=nb_sb_noss");
		
		driver.quit();
		
	}

}
