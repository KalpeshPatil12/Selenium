package com.OrangeHRMAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoMode {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");

	}

}
