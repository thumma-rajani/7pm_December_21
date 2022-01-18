package com.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class capturescreens {
	
	static WebDriver driver;
	
	public String Capturescreens(WebDriver driver,WebElement element, String screenname) throws IOException {
		//public String Capturescreens(WebDriver driver,String screenname) throws IOException {
		File file = element.getScreenshotAs(OutputType.FILE); 
		//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		String datename = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		File dest = new File ("./TestScreens//"+screenname+datename+".png");
		String destpath = dest.getAbsolutePath();
		FileUtils.copyFile(file, dest);
		
		return destpath;
	}

}
