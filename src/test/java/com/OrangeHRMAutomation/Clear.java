package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement email=driver.findElement(By.id("Email"));
		
		email.clear();
		
		email.sendKeys("kalpesh@123");
		
		//driver.findElement(By.id("Email")).sendKeys("kalpesh@gmail.com");
		
		//System.out.println("Result from get attribute"+driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println("The value of test is "+email.getAttribute("class"));
		
		System.out.println("The value of test is "+email.getText());
		
		WebElement ele=driver.findElement(By.id("Password"));
		
		ele.clear();
		
		ele.sendKeys("1234");
		
		WebElement log=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		
		System.out.println("The value is "+log.getAttribute("class"));
		
		System.out.println("The value is "+log.getAttribute("type"));
		
		System.out.println("The value is "+log.getText());
		
		//log.click();
		
		String str=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[1]/h1")).getText();
		
		System.out.println(str);
	
		//System.out.println(driver.getCurrentUrl());
		//email.clear();
		
		
	}

}
