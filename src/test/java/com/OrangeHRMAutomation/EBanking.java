package com.OrangeHRMAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EBanking {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-noifications");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/v4/");
        driver.findElement(By.name("uid")).sendKeys("mngr416398");
		driver.findElement(By.name("password")).sendKeys("tAgEmuz");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class=\"menusubnav\"]/child::*[2]/child::*")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@class=\"ns-ndnbj-e-16\"]")).click();
		
		driver.findElement(By.name("name")).sendKeys("Ram");
		
		driver.findElement(By.name("rad1")).click();
		
		driver.findElement(By.name("addr")).sendKeys("INDIA");
		
		driver.findElement(By.name("city")).sendKeys("Jalgaon");
		
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		
		driver.findElement(By.name("pinno")).sendKeys("424210");
		
		driver.findElement(By.name("telephoneno")).sendKeys("853210");
		
		driver.findElement(By.name("emailid")).sendKeys("kahhdjd@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("55455");
		
		driver.findElement(By.name("sub")).click();

	}

}
