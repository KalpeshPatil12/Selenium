package com.OrangeHRMAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShoot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// Screenshot of full page
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File(".\\ScreenShot\\homepage.png");
		
		FileUtils.copyFile(src, trg);
		
		// Screenshot of some portion
		
		//WebElement sec=driver.findElement(By.xpath("//*[@class=\"category-grid home-page-category-grid\"]/child::*"));
		
		//File src=sec.getScreenshotAs(OutputType.FILE);
		
		//File trg=new File(".\\ScreenShot\\feature.png");
		
		//FileUtils.copyFile(src, trg);
//		
//        WebElement ele=driver.findElement(By.xpath("//*[@class=\"header-logo\"]/child::*/child::*"));
//		
//		File src=ele.getScreenshotAs(OutputType.FILE);
//		
//		File trg=new File(".\\ScreenShot\\logo.png");
//		
//		FileUtils.copyFile(src, trg);
//		
//		driver.close();

	}

}
