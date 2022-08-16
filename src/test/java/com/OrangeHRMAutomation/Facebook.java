package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Current URL of the page is "+driver.getCurrentUrl());
		
        String actualURL=driver.getCurrentUrl();
		
		String expectedURL="https://www.facebook.com//";
		
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Pass");
		}
		else
		{
		 System.out.println("Failed");
		}
		
		System.out.println("Current Title of the page is "+driver.getTitle());
		
		String actualTitle=driver.getTitle();
		
		String expectedTitle="Facebook";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}

        driver.findElement(By.xpath("//*[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
	    driver.findElement(By.name("firstname")).sendKeys("Ram");
		
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		
		driver.findElement(By.name("reg_email__")).sendKeys("ram@123");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
		
		WebElement drop=driver.findElement(By.id("day"));
		
		Select dropDay=new Select(drop);
		
		dropDay.selectByIndex(2);
		
		//dropDay.selectByValue("1");
		
		//dropDay.selectByVisibleText("2");
		
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
