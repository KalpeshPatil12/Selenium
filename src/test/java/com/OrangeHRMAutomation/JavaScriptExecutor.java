package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://google.com");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("");
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
//		js.executeScript("argument[0].click();", driver.findElement(By.id("btnLogin")));
//		
//		js.executeScript("alert('This is a sample alert in selenium !');");
//		
//		js.executeScript("confirm('This is a sample alert in selnium !');");
//		

	}

}
