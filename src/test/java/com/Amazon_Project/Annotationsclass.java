package com.Amazon_Project;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationsclass {
	static WebDriver driver;
	@BeforeTest()
	public void startBrowser() {
		 WebDriverManager.chromedriver().setup();
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--start-maximize");
		  driver = new ChromeDriver(options);
		  
		  driver.get("https://www.google.com/");
	}
  @Test
   public void verify_gmail_link() {
	 
	  if(driver.getPageSource().contains("Gmail"))
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertFalse(false);
	  }
  }
  @Test
	  public void verify_Images_link() {
		 
		  if(driver.getPageSource().contains("Images"))
		  {
			  Assert.assertTrue(true);
		  }
		  else
		  {
			  Assert.assertFalse(false);
		  }  
	  }
  
  @AfterTest
	   public void closetest() {
		   driver.close();
		   
	   }
  }

