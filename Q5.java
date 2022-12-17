package com.bd.WebAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Q5 extends BaseDriver{
	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get(url3);
		driver.manage().window().maximize();
		Thread.sleep(2000);

   }
	@Test(priority = 1)
	public void Hover() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement AutomotiveMotorbike = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement MotorcycleRidingGear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement Helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		action.moveToElement(AutomotiveMotorbike).perform();
		Thread.sleep(6000);
		
		action.moveToElement(MotorcycleRidingGear).perform();
		Thread.sleep(6000);
		
		Helmet.click();
		Thread.sleep(6000);
		
		
	}

}
