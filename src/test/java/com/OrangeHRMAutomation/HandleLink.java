package com.OrangeHRMAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[text()=\"Today's Deals\"]")).click();
		
        List<WebElement> list=driver.findElements(By.tagName("a"));
        
        System.out.println("Number of link present in the Website is "+list.size());
        
        for(int i=0;i<=list.size();i++)
        {
        	System.out.println(list.get(i).getText());
        	System.out.println(list.get(i).getAttribute("href"));
        }
        
	}
	
}
