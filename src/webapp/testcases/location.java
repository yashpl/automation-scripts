package webapp.testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import webapp.pages.*;

@Test
public class location {

		public void verifyvalidlocation() throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","chromedriver");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("headless");
	        options.addArguments("window-size=1200x600");
			WebDriver driver=new ChromeDriver(options);
			driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/");
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MICROSECONDS);
			set_location loc=new set_location(driver);
			
			loc.loc_logo();
			loc.slctr_loc();
			loc.locality();
			driver.close();
			
		}
		
		

	}