package com.OrangeHRMAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon4 {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@class=\"nav-a  \"][2]")).click();
		
		driver.findElement(By.xpath("//*[@class=\"a-section a-spacing-none\"][2]/child::ul/child::*/child::*/child::*/child::*/child::*/child::*[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class=\"a-section a-spacing-none\"][5]/child::ul[2]/child::*/child::*/child::*/child::*/child::*/child::i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class=\"s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=TOP_BANNER_MESSAGE widgetId=messaging-messages-results-header-builder\"][1]/following::*[1]/child::*/child::*/child::*/child::*/child::*[3]/child::*/child::*")).click();
		Thread.sleep(2000);
		
        Set<String> str=driver.getWindowHandles();
		
		Iterator<String> i=str.iterator();
		
		String parent=i.next();
		
		String child=i.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//*[@name=\"submit.add-to-cart\"]")).click();
		
		
		//driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-checkbox\"]/../../../../../../../..")).click();

	}

}
