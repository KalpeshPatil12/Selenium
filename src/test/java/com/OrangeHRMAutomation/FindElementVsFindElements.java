package com.OrangeHRMAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://demo.nopcommerce.com/");
       
       //driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/input")).sendKeys("XYZ");
       
       //WebElement ele=driver.findElement(By.xpath("/html/body/div[6]/div[4]//a"));
       
       //System.out.println(ele.getText());
       
       //driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
       
       List<WebElement>Links=driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
       
       System.out.println("Total links are available are "+Links.size());
       
       List<WebElement>logo=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
       
       System.out.println("The size of logo are"+logo.size());
       
       List<WebElement>size=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul"));
       
       System.out.println("The size of is "+size.size());
       

       
	}

}
