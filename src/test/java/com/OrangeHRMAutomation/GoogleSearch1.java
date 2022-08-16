package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastName")).sendKeys("Peter");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Username")).sendKeys("pqvfhfw124");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		
		//CTRL - A
       action.keyDown(Keys.CONTROL);
		
		action.sendKeys("a");
		
		action.keyUp(Keys.CONTROL);
		
		action.perform();
		
		//CTRL - C
		action.keyDown(Keys.CONTROL);
		
		action.sendKeys("c");
		
		action.keyUp(Keys.CONTROL);
		
		action.perform();
		
		//Tab
		action.sendKeys(Keys.ENTER);
		
		action.perform();
		
		//CTRL - V
        action.keyDown(Keys.CONTROL);
		
		action.sendKeys("v");
		
		action.keyUp(Keys.CONTROL);
		
		action.perform();
		

		//CTRL - A
		action.keyDown(Keys.CONTROL);
		
		action.sendKeys("a");
		
		action.keyUp(Keys.CONTROL);
		
		action.perform();
		
		//CTRL - C
		action.keyDown(Keys.CONTROL);
		
		action.sendKeys("c");
		
		action.keyUp(Keys.CONTROL);
		
		action.perform();
		
		//Tab
		action.sendKeys(Keys.ENTER);
		
		action.perform();
		
		//CTRL - V
        action.keyDown(Keys.CONTROL);
		
		action.sendKeys("v");
		
		action.keyUp(Keys.CONTROL);
		
		action.perform();
		
		driver.findElement(By.id("i3")).click();
		
		}

}
