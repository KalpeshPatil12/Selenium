package com.OrangeHRMAutomation;

import CyberSuccess.CST_43.Base_Class;

public class Lounch_Browser extends Base_Class {

	public static void main(String[] args){
	
		try
		{
	
			getbrowserInstance("Chrome");
			
			driver.navigate().to("https://google.com");		
			
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			
			if(driver.getTitle().equals("OrangeHRM"))
			{
				
				System.out.println("Web page verification is passed");
				
			}
			else
			{
				throw new Exception ("Web page verification is failed");
				
			}
		}
			
		catch(Exception e)
		{
				e.printStackTrace();
				
		}		
		//finally
		//{
//driver.close();
	//	}
			
		}

	}

