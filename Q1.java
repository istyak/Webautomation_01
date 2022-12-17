package com.bd.WebAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Q1 extends BaseDriver{
	@Test(priority = 0)
	public void startWebSite() {
		driver.get(url1);
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	public void fillUp() throws InterruptedException {
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Istyak Ahamed");
		Thread.sleep(2000);
		
		WebElement mobileNumber = driver.findElement(By.id("phone"));
		mobileNumber.sendKeys("01634111409");
		Thread.sleep(2000);
		
		
		WebElement emailAddress = driver.findElement(By.id("email"));
		emailAddress.sendKeys("ahamedistyak@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("uIop7");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Malibagh, more, Dhaka");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(5000);
		//name="submit"
	}

}
