package com.OrangeHRMAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("ds");
		/*
		driver.findElement(By.xpath("//*[@class=\"nav-a  \"][2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div/label/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"p_n_specials_match/21618256031\"]/span/a/div/label/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[3]/div[1]/h2/a/span")).click();
		
		Set<String> str=driver.getWindowHandles();
		
		System.out.println(str);
		
		Iterator<String> i=str.iterator();
		
		String parent=i.next();
		
		String child=i.next();
		
		driver.switchTo().window(child);
		
		//Select sec=new Select(driver.findElement(By.xpath("//*[@id=\"quantity\"]")));
		
		//sec.selectByValue("2");
		
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        
        //driver.findElement(By.id("addToCart_feature_div")).click();
		
		//driver.findElement(By.xpath("//*[@title=\"Add to Shopping Cart\"]")).click();

		*/
	}

}
