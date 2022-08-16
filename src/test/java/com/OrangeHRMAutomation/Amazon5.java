package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[text()=\" Electronics \"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)"," ");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/child::*[5]/child::*[2]/child::*[2]/child::*/child::*")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class=\"s-main-slot s-result-list s-search-results sg-row\"]/child::*[2]/child::*/child::*/child::*/child::*/child::*[3]/child::*[1]/child::*/child::*")).click();
		
		
	}

}
