package com.crm.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crm.base.TestBase;

public class CalendarPage extends TestBase{
	
	
	public void verifyCalendarPage()
	{
		WebElement create= driver.findElement(By.xpath("//a[2]//button[@class='ui linkedin button']"));
		WebElement events= driver.findElement(By.xpath("//a[1]//button[@class='ui linkedin button']"));
		
		Assert.assertTrue(create.isDisplayed());
		Assert.assertTrue(events.isDisplayed());
	}
}





