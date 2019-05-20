package webapp.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class set_location {
WebDriver driver;
	
	By loc_logo=By.id("header_loc_btn");
	By slctr_loc=By.xpath("//*[@id=\"dialogContent_12\"]/div/div[2]/md-grid-list/md-grid-tile[1]/figure/md-card/md-card-content/div[2]/div");
	By locality=By.xpath("//*[@id=\"dialogContent_12\"]/div/div[4]/input");
	
	public set_location(WebDriver driver) {
		this.driver=driver;
		
	}
	public void loc_logo() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(loc_logo).click();
	}
	
	public void slctr_loc() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(slctr_loc).click();
	}
	
	public void locality() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		WebElement loc = driver.findElement(locality);
        loc.sendKeys("Rajajinagar");
        loc.sendKeys(Keys.DOWN);
        loc.sendKeys(Keys.RETURN);
		
	
	
	

}


}
