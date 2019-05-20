package webapp.testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import webapp.pages.*;

public class location {

		@Test
		public void verifyvalidlocation() throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/");
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MICROSECONDS);
			set_location loc=new set_location(driver);
			loc.loc_logo();
			loc.slctr_loc();
			loc.locality();
			
		}
		
		

	}