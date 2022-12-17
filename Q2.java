package com.bd.WebAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Q2 extends BaseDriver {
	
		@Test(priority = 0)
		public void startWebSite() {
			driver.get(url1);
			driver.manage().window().maximize();
		}
		@Test(priority = 1)
	public void dropDown() throws InterruptedException {
			WebElement country = driver.findElement(By.xpath("//select[@class='custom-select']"));
			Select select = new Select(country);
			select.selectByIndex(1);
			Thread.sleep(5000);
			
			
		
	}
}
