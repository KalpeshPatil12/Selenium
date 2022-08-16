package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//*[@class=\"uprcse semi-bold\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/section/div/form/div[1]/div[1]/div/div/input[1]")).sendKeys("D:\\Resume.pdf");
		
		//driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("Downloads");

	}

}
