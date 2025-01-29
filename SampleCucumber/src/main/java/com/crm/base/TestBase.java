package com.crm.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	static protected WebDriver driver;
	static protected Properties prop;
	
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	public void loadProperty() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Config/config.properties");
		prop.load(fis);
		
	}
	public void launchApp()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
