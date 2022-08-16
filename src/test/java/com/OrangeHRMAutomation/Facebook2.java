package com.OrangeHRMAutomation;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook2 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com//");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		System.out.println("Current URL of the page is "+driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter URL: ");
		
		String expectedURL=s.nextLine();
		
		System.out.println("URL: "+expectedURL);
		
		String actualURL=driver.getCurrentUrl();
		
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Pass");
		}
		else
		{
		 System.out.println("Failed");
		}
		
		System.out.println("Current Title of the page is "+driver.getTitle());
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter Title: ");
		
		String expectedTitle=s1.nextLine();
		
		System.out.println("Title: "+expectedTitle);
		
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
		 System.out.println("Failed");
		}
		
        driver.findElement(By.xpath("//*[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click(); //Create click on new button
        Thread.sleep(3000);
		
	    driver.findElement(By.name("firstname")).sendKeys("Ram");
	    Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("ram@123");
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
		Thread.sleep(3000);
		
		WebElement drop=driver.findElement(By.id("day"));
		
		Select dropDay=new Select(drop);
		
		dropDay.selectByIndex(2);
		
		dropDay.selectByValue("3");
		
		WebElement drop1=driver.findElement(By.id("month"));
		
		Select dropMonth=new Select(drop1);
	
		dropMonth.selectByVisibleText("May");
		
		WebElement drop2=driver.findElement(By.id("year"));
		
		Select dropYear=new Select(drop2);
		
		dropYear.selectByVisibleText("2022");
		
        driver.findElement(By.xpath("//*[@class=\"_5k_2 _5dba\"][2]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
		
	}

}
