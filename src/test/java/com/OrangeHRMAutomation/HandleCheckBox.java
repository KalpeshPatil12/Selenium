package com.OrangeHRMAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//driver.findElement(By.id("monday")).click();
		
		List<WebElement>list=driver.findElements(By.xpath("//*[@type=\"checkbox\" and contains(@id, 'day')]"));
				
		System.out.println("List of web element is "+list.size());
		
		/*
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
		}
		*/
				
		for(WebElement List:list)
		{
			List.click();
		}
				

	}

}
