package com.OrangeHRMAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		driver.findElement(By.xpath("//*[text()=\"Live Posting\"]")).click();
		
		WebElement dropElement=driver.findElement(By.name("category_id"));
		
		Select drpselect=new Select(dropElement);
		
		List<WebElement> options=drpselect.getOptions();
		
		ArrayList originallist=new ArrayList();
	
		ArrayList templist=new ArrayList();
		
		for(WebElement option:options)
		{
			originallist.add(option.getText());
			templist.add(option.getText());
	    }
		
		System.out.println("Original List "+originallist);
		
		System.out.println("Temp List "+templist);
		

		//Collections.sort(templist);
}
}
