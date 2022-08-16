package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window2 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		ele.sendKeys("chair");
		
		ele.submit();
		
		System.out.println("The text is "+ele.getText());
		
		
	}

}
