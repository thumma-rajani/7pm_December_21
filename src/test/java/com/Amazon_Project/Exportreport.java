package com.Amazon_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utilities.capturescreens;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exportreport {
	static WebDriver driver;
	static WebElement gmail,Images;
	static capturescreens screens;
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeSuite()
	public void setupsuit() {
		screens = new capturescreens();
		report= new  ExtentReports ("./ExtentReportt/MyTestReport.html");
		test = report.startTest("Verifying Gmail links");
		
	}
		
	
	
	@BeforeTest
	public void startbrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	test.log(LogStatus.INFO, "starting browser");
	driver.manage().window().maximize();
	test.log(LogStatus.INFO, "Maximizing screen");
	}
	
	@Test(priority = 0 , description = "Testcase1")
	
	public void verify_gmail_link() {
	WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	String exp = gmail.getText();
	test.log(LogStatus.INFO, exp);
	//System.out.println(exp);
	String act = "gmail";
	Assert.assertEquals(exp,act);
	if(exp.equals(act)) {
		test.log(LogStatus.PASS, "Step verified");
	}else
	{
		test.log(LogStatus.FAIL, "Step failed");
	}
}
	
	
	@Test(priority = 1 , description = "Testcase2")
	
	public void verify_Images_link() {
	WebElement Images = driver.findElement(By.xpath("//a[contains(text(),'Images')]"));
	String explink = Images.getText();
	test.log(LogStatus.INFO, explink);
//	System.out.println(explink);
	String actlink = "Images";
	Assert.assertEquals(explink,actlink);
	
	if(explink.equals(actlink)) {
		test.log(LogStatus.PASS, "Step verified");
	}else
	{
		test.log(LogStatus.FAIL, "Step failed");
	}

	}
@AfterTest
public void closetest() {
	report.flush();
	driver.close();
}
}


