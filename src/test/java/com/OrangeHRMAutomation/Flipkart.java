package com.OrangeHRMAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8530515733");
		
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Kalpesh@123");
		
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class=\"_37M3Pb\"]/child::*[3]/child::*/child::*[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=\"POCO\"]")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)"," ");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[text()=\"4★ & above\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=\"6 GB\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=\"POCO M4 Pro 5G (Cool Blue, 128 GB)\"]")).click();
		Thread.sleep(2000);
		
        Set<String> str=driver.getWindowHandles();
		
		Iterator<String> i=str.iterator();
		
		String parent=i.next();
		
		String child=i.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//*[@class=\"_35mLK5\"]"));
		
		System.out.println(ele.getText());
	}

}
