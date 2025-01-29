package com.crm.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.crm.base.TestBase;

public class LaunchPage extends TestBase
{

	public void verifyApplicationLaunchPage()
	{
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Free CRM Software - Customer Relationship Management"));
	}
	
	public LoginPage navigateToLoginPage()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		return new LoginPage();
		
	}
}
