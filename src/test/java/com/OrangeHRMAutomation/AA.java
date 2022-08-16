package com.OrangeHRMAutomation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AA {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.amazon.in/");
		
	   //	Verify Title
		
//		System.out.println(driver.getTitle());
		
//		if(driver.getTitle().equals("Amazon"))
//		{
//			System.out.println("Successfull login the page");
//		}
//		
//		else
//		{
//			System.out.println("Failed to login");
//		}
		
//        Scanner s=new Scanner(System.in);
//		
//		System.out.println("Enter Title: ");
//		
//		String expectedTitle=s.nextLine();
//		
//		System.out.println("Title: "+expectedTitle);
//		
//		String actualTitle=driver.getTitle();
//		
//		if(actualTitle.equals(expectedTitle))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//		 System.out.println("Failed");
//		}
		
		//driver.get("https://www.google.com/");
		
//		WebElement ele=driver.findElement(By.name("q"));
//		
//		//Action KeyWord
//		
//		Actions act=new Actions(driver);
//		
//		act.moveToElement(ele)
//		.click()
//		.keyDown(ele, Keys.SHIFT)
//		.sendKeys(ele,"Kalpesh")
//		.keyUp(ele,Keys.SHIFT)
//		.build()
//		.perform();
		
		// Handle multiple window and tab
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
//		driver.get("https://www.flipkart.com/");
		
		
	    //	Print link 
//		
//		System.out.println(driver.getTitle());
//		
//		List<WebElement> link=driver.findElements(By.tagName("a"));
//		
//	    System.out.println(link.size());
//		
//		for(WebElement links:link)
//		{
//			System.out.println(links.getText());
//		}
		
	   //	Take ss
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		
//		File trg=new File(".\\ScreenShot\\homepage.png");
//		
//		FileUtils.copyFile(src, trg);
		
	   //	Handle Broken Link
		
//		driver.get("http://www.deadlinkcity.com/");
//
//		List<WebElement>links=driver.findElements(By.tagName("a"));
//		
//		System.out.print(links.get(0));
//		
//		// Select DropDown
		
//      driver.get("https://www.opencart.com/index.php?route=account/register");
//		
//		WebElement dropCountryEle=driver.findElement(By.id("input-country"));
//		
//		Select dropCountry=new Select(dropCountryEle);
//		
//      dropCountry.selectByVisibleText("Aruba");
//       
//		dropCountry.selectByValue("14");  //Aus
//		
//		dropCountry.selectByIndex(13); //Aus
//		
        // Alert
		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
//		
//      driver.switchTo().alert().accept();
//        
//      driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
//        
//      Thread.sleep(3000);
//        
//      driver.switchTo().alert().accept();
//        
//      driver.switchTo().alert().dismiss();
//		
//		WebElement ele=driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button"));
//		
//		ele.sendKeys("abc");
//		
//	    driver.switchTo().alert().sendKeys("abc");
//
	}

}
