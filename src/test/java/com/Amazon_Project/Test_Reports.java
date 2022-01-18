package com.Amazon_Project;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.Utilities.capturescreens;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test_Reports {
	static WebDriver driver;
	capturescreens screen = new capturescreens();
	
	
	@Test
	
	public void Testreports() throws IOException  {
		
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		// Taking Screenshots
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		WebElement un =driver.findElement(By.name("user"));
		un.sendKeys("qatrainer");
		screen.Capturescreens(driver, un, "username");
		//screen.Capturescreens(driver, "username");  //Capturing full screen
		
		
		//FileUtils.copyFile(file, new File("./TestScreens/username.png"));
		WebElement ps = driver.findElement(By.name("pass"));
		ps.sendKeys("admin123");
		screen.Capturescreens(driver, ps, "password");
		//screen.Capturescreens(driver, "password");
		
		//FileUtils.copyFile(file, new File("./Testscreens/password.png"));
		driver.findElement(By.name("btnSubmit")).click();
		driver.close(); 

	/*@AfterTest
	
	public void Failed_report(ITestResultresult) {
		
		if(ITestResultresult.FAILURE==result.getstatus())
		{
			try {
				screen.Capturescreens(driver, "Step Failed");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}*/
	

	
	}}


		
		
		
	
		
	
	


