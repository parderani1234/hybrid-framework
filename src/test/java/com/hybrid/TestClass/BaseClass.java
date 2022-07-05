package com.hybrid.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.hybrid.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static  WebDriver driver;
	
	ReadConfig rc = new ReadConfig();
	String url=rc.getBaseurl();
	String browser=rc.getBrowser();
	String username=rc.getusername();
	String passward=rc.getpass();
	
	
@BeforeClass
public void setup()
{
	switch (browser.toLowerCase()) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		break;

		
	case "edge":
		WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		break;
		
		
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			break;
		
		
	default:
		
		driver=null;

		break;
	}
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
}
}

/*
@AfterClass
public void tearup()

{
driver.close();	
}

}
*/