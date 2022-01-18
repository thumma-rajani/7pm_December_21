package BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.Utilities.Browsefactory;

public class BaseTest  {
	public static WebDriver driver ;
	public  static Browsefactory launchbrowser;
	
			
			
			@BeforeSuite
			public void suitefiles() {
				launchbrowser = new Browsefactory();
			
			}
			
			@BeforeTest
			public void startBrowser() {
				
				driver = Browsefactory.startBrowser("chrome","https://google.com/");
			}
			
		  		  
		  @AfterTest
		  public void closetest() {
			  driver.close();
		  
	
	}

}
