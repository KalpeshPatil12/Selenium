package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerIFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		
		driver.switchTo().frame(0);
		
		System.out.println("Test of frame is "+driver.findElement(By.xpath("/html/body/h1")).getText());
		
		driver.switchTo().parentFrame();
		
		System.out.println("This is outer text "+driver.findElement(By.xpath("/html/body/p")).getText());
	}

}
