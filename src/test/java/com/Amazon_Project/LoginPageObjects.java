package com.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	static WebDriver driver;
	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement loginbutton;
	@FindBy(xpath="//*[@id=\"user_bar\"]/ul/li[1]/a")WebElement signout;
	@FindBy(id = "right_col_top_err")WebElement usermessage;
	
	
	public LoginPageObjects getusername(String un) {
		username.sendKeys(un);
		return this;
	}
	
	public LoginPageObjects getpassword(String ps) {
		password.sendKeys(ps);
		return this;
	}
	public LoginPageObjects getloginbutton() {
		if(loginbutton.isDisplayed() && loginbutton.isEnabled()) {
			loginbutton.click();
		}else
			System.out.println(usermessage.getText());
		    System.out.println("Invalid credentials And Login Not Success");
		return this;
	}
	
	public LoginPageObjects getsignout() {
		if(signout.isDisplayed() && signout.isEnabled()) {
			signout.click();
			System.out.println("Valid credentials And Login Success");
		}
		return this;
		
	}

}
