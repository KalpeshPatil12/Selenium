package com.OrangeHRMAutomation;

import org.openqa.selenium.By;

import CyberSuccess.CST_43.Base_Class;

public class VerifyLoginFeature extends Base_Class {

	public static void main(String[] args) throws Exception {
		
		getbrowserInstance("Chrome");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		String pageTitle=driver.getTitle();
		
		//validate(pageTitle,"OrangeHRM");
		
		/*
		if(pageTitle.equals("OrangeHRM"))
		{
			System.out.println("Successfully validate the title of orange hrm page");
		}
		
		else
		{
			System.out.println("Failed to validate the login page");
		}
		*/
				
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("button")).click();
		
        String incorrectcredUrl="https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
		
		if(driver.getCurrentUrl().equals(incorrectcredUrl))
			
		{
			String errorMessage=driver.findElement(By.id("spanMessage")).getText();
			
		//	validate(errorMessage, "Invalidcredential");
		}
		else
		{
			String currentUrl=driver.getCurrentUrl();
			
			System.out.println(currentUrl);
			
	//		validate(currentUrl, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			if(driver.findElement(By.xpath("//a[@id=menu_admin_viewAdminModule]")).isDisplayed());
			
			{
				System.out.println("Successfully validate the login page");
			}
		//	else
			{
				throw new Exception("Failed to validate the page");
			}
			
		}
		}
		
	}

