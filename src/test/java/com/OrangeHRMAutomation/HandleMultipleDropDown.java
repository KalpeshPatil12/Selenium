package com.OrangeHRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/es/prueba-de-30-dias-de-orangehrm/");
		
		Select dropEmp=new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
		
		dropEmp.selectByVisibleText("21 - 25");
		
		Select dropInd=new Select(driver.findElement(By.id("Form_submitForm_Industry")));
		
		dropInd.selectByVisibleText("Computación / Tecnología - Servicios / Consultoría");
		
		Select dropCount=new Select(driver.findElement(By.id("Form_submitForm_Country")));
		
		dropCount.selectByVisibleText("American Samoa");
		
		

	}

}
