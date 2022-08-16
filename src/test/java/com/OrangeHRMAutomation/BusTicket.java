package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BusTicket {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.busonlineticket.com/booking/bus-tickets.aspx");
		
		WebElement ele1 = driver.findElement(By.id("txtOriginGeneral"));
		
		ele1.isDisplayed();
		
		ele1.click();
		
		//driver.findElement(By.id("txtOriginGeneral")).click();
		
		driver.findElement(By.xpath("//*[@id=\"divFromList\"]/ul/li[1]/ul/li[1]/div")).click();
		
		driver.findElement(By.id("txtDestinationGeneral")).click();
		
		driver.findElement(By.xpath("//*[@id=\"divToList\"]/ul/li[1]/ul/li[1]/div")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class=\"ui-datepicker-next ui-corner-all\"]")).click();
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[text()=\"20\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnBusSearchNewGeneral")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("cheapest")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"subtab1\"]/table/tbody/tr[1]/td[6]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()=\"18\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=\"19\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class=\"seatproceed\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class=\"payment_textName form-control pay-form-control\"]")).sendKeys("Kalpesh Patil");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class=\"payment_txtPhoneLogin form-control pay-form-control\"]")).sendKeys("8530515733");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class=\"payment_txtEmail form-control pay-form-control\"]")).sendKeys("kalpesh@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class=\"pay-link d-flex link-de\"]")).click();
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}

}
