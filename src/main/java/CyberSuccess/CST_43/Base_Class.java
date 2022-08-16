package CyberSuccess.CST_43;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver=null;
	
	public static void getbrowserInstance(String browser) {
		
	switch(browser)
	
	{
	
	case "Chrome":
		
    WebDriverManager.chromedriver().setup();
 
    driver=new ChromeDriver();
    
    break;
    
	case "Edge":
	
	WebDriverManager.edgedriver().setup();

	driver=new EdgeDriver();
	
	default:
		
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			
	driver=new ChromeDriver();

	}
		
	}
}
	