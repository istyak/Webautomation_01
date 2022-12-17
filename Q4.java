package com.bd.WebAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Q4 extends BaseDriver {
	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get(url2);
		driver.manage().window().maximize();
		Thread.sleep(2000);

   }
	@Test(priority = 1)
	public void AlertsHandle() throws InterruptedException {
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		jsAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String resultText1 = result.getText();
		Assert.assertEquals(resultText1, "You successfully clicked an alert");
		
		Thread.sleep(5000);
		
		SoftAssert softAssert = new SoftAssert();
		jsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		String resultText2 = result.getText();
		softAssert.assertEquals(resultText2, "You clicked: ");
		Thread.sleep(5000);
		
		jsPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello Audry");
		driver.switchTo().alert().accept();
		String resultText3 = result.getText();
		Assert.assertEquals(resultText3, "You entered: Hello Audry");
		Thread.sleep(5000);
		softAssert.assertAll();		
	}
}