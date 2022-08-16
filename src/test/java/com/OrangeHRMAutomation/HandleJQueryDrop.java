package com.OrangeHRMAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQueryDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//selectChoiceValues(driver,"choice 1");
		
		selectChoiceValues(driver, "choice 2, choice 2 3, choice 6, choice 6 2 1, choice 6 2");

	}

	private static void selectChoiceValues(WebDriver driver, String... value)
	{
	 
		List<WebElement> choiceList=driver.findElements(By.xpath("//*[@class=\"comboTreeItemTitle\"]"));
		
		  if(!value[0].equalsIgnoreCase("all"))
		  {
			  for(WebElement item:choiceList)
			  {
				  String text=item.getText();
				  
				  for(String val:value)
				  {
					  if(text.equals(val))
					  {
						  item.click();
						  break;
					  }
				  }
			  }
		  }
		  else
		  {
			  for(WebElement item:choiceList)
			  {
				  item.click();
			  }
		  }
	}

}
