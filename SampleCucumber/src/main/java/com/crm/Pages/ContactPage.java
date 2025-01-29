package com.crm.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.TestBase;

public class ContactPage extends TestBase{
	
	
	public void verifyContactPage()
	{
		WebElement create1= driver.findElement(By.xpath("//a[1]//button[@class='ui linkedin button']"));
		WebElement export= driver.findElement(By.xpath("//button[3][@class='ui linkedin button']"));
		
		Assert.assertTrue(create1.isDisplayed());
		Assert.assertTrue(export.isDisplayed());
		
	}
	
	public void selectDropdown() throws InterruptedException
	{
		Thread.sleep(4000);
    /* WebElement drdown = driver.findElement(By.xpath("//table//th[2]//div[@class='ui selection upward dropdown']"));
		Select select = new Select(drdown);
		select.selectByVisibleText("Queue calls"); */
		driver.findElement(By.xpath("//span[@class='user-display']")).click();
		
	driver.findElement(By.xpath("//table//th[2]//div[@class='ui selection upward dropdown']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Assign to Campaign')]")).click();
	
	Thread.sleep(4000);
		driver.findElement(By.xpath("//table//th[2]//div[@class='ui basic icon left attached button']")).click();
		
	}
}


