package com.Amazon_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BaseClass.BaseTest;

public class SearchTest extends BaseTest{
//static WebDriver driver;
	@Parameters({"username","password"})
		@Test
		 public void testsearch(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("user")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("btnSubmit")).click();
			
	}
	
}
