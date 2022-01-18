package com.Amazon_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import BaseClass.BaseTest;

public class search  extends BaseTest{
  @Test
  public void searchtest() {
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.name("btnI")).click();
		
  }
}
