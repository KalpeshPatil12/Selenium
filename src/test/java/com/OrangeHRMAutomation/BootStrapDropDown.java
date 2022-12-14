package com.OrangeHRMAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.hdfcbank.com/");
        
        driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']"));
        
        List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        
        //System.out.println("Number of option "+productTypes.size());
        
       for(WebElement pType:productTypes)
       {
    	   if(pType.getText().equals("EMI"))
    	   {
    		   pType.click();
    		   break;
    	   }
       }
        
	}

}
