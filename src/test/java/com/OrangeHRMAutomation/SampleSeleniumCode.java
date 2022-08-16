package com.OrangeHRMAutomation;

import org.openqa.selenium.By;

import CyberSuccess.CST_43.Base_Class;

public class SampleSeleniumCode extends Base_Class{

	public static void main(String[] args) {
		
		getbrowserInstance("Chrome");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			
		driver.findElement(By.id("btnLogin")).submit();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Kalpesh");
		
		driver.findElement(By.id("lastName")).sendKeys("Patil");
		
		driver.findElement(By.id("chkLogin")).click();
		
		driver.findElement(By.id("user_name")).sendKeys("KalpeshPatil");
		
		driver.findElement(By.id("user_password")).sendKeys("Kalpesh@123");
		
		driver.findElement(By.id("re_password")).sendKeys("Kalpesh@123");
		
		driver.findElement(By.id("btnSave")).click();
		
	}

	
}
