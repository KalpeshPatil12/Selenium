package com.OrangeHRMAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.print(links.get(0));
		
		
	}

}
