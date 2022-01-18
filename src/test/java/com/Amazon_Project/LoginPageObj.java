package com.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utilities.Browsefactory;

public class LoginPageObj {

	public WebDriver driver;
	public LoginPageObjects loginpage;
	public Browsefactory browser = new Browsefactory();
	
	
	
	@BeforeTest
	public void getbrowser() {
		driver = browser.startBrowser("chrome", "https://www.mycontactform.com/");
		
	}
	@Test(priority=0)
	public void Verify_valid_login() throws InterruptedException {
		loginpage = PageFactory.initElements(driver, LoginPageObjects.class);
		loginpage.getusername("qatrainer").getpassword("admin123").getloginbutton().getsignout();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=1)
	public void Verify_Invalid_login() {
		loginpage = PageFactory.initElements(driver, LoginPageObjects.class);
		loginpage.getusername("tester").getpassword("admin123").getloginbutton();
		
	}
	
	@AfterTest
	public void closetest() {
		driver.close();
	}
	}


