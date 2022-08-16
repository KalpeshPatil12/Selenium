package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@class=\"indexContainer\"]/child::*[2]/child::*[1]/child::*")).click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
//		driver.switchTo().frame("packageFrame");
//		
//		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[1]/a")).click();
//		Thread.sleep(5000);
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(2);
//		
//		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
	}

}
