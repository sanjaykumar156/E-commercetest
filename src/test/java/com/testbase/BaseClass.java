package com.testbase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	public ResourceBundle rb;
	
	@BeforeSuite
	public void setup() {
		rb= ResourceBundle.getBundle("config");
		
		if(rb.getString("browser").equals("edge")) {
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(rb.getString("url"));
		
		
		
	}
	
	@AfterSuite
	public void teardown() {
//		driver.quit();
	}

}
