package com.crm.Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.TestBase;

public class HomePage extends TestBase{
	
	public void verifyApplicationinhome()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[contains(text(),'Home')]")));
	}
	
	public void verifyHomePage()
	{
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cogmento CRM"));
		//Check the name
		String exptext = "Jismin Thomas";
		String acttext = driver.findElement(By.xpath("//div[@id='top-header-menu']//span[1]")).getText();
		Assert.assertEquals(exptext, acttext, "Pass");
		
	}

	public CalendarPage clickCalendartButton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		return new CalendarPage();
	}
	
	public ContactPage clickContactButton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Contact')]")).click();
		return new ContactPage();
	}
	

}
