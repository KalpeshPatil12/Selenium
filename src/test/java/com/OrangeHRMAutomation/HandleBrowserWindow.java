package com.OrangeHRMAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Handle Single Window
		String handle=driver.getWindowHandle();
		
		System.out.println(handle);
		
		//Handle Multiple Window
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		System.out.println(handles);
		
		

	}

}
