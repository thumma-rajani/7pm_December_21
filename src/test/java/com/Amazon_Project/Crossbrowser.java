package com.Amazon_Project;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
	static WebDriver driver;
@Parameters({"browser"})	
	@BeforeTest
	public void getbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
						
		}
		driver.get("https://www.google.com/");
	}
	
	@Test
	
	public void loginTc() {
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.name("btnI")).click();
	}
	
	@AfterTest
	public void closetest() {
		driver.close();
		
	}

}
