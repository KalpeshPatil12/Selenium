package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.navigate().to("https://www.google.com/");
	   //Thread.sleep(3000);
	   
	   driver.navigate().back();
	   //Thread.sleep(3000);
	   
	   driver.navigate().forward();
	   //Thread.sleep(3000);
	   
	   driver.navigate().refresh();
	   //Thread.sleep(3000);
	   
	   //driver.findElement(By.xpath("//*[@class=\"gb_Ve\"]")).click();
			
       
		
	}
}