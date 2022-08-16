package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement fb=driver.findElement(By.name("email"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(fb)
		.click()
		.keyDown(fb, Keys.SHIFT)
		.sendKeys(fb,"Kalpesh@gmail.com")
		.keyUp(fb, Keys.SHIFT)
		.build()
		.perform();
		
		WebElement fb1=driver.findElement(By.id("pass"));
		
        Actions act1=new Actions(driver);
		
		act1.moveToElement(fb)
		.click()
		.keyDown(fb1, Keys.SHIFT)
		.sendKeys(fb1,"Kalpesh")
		.keyUp(fb1, Keys.SHIFT)
		.build()
		.perform();
		
		
	}
}
