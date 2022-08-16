package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import CyberSuccess.CST_43.Base_Class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddEmp  {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://google.com");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).submit();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Ram");
		
		driver.findElement(By.id("lastName")).sendKeys("Patil");
		
		driver.findElement(By.id("btnSave")).click();
		
	}

}
