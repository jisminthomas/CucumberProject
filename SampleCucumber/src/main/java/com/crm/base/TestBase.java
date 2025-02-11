package com.crm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	static protected WebDriver driver;
	static protected Properties prop;
	static protected String data;

	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	

	public String  ReadExcel() throws IOException {

		File Excel=new File("C:\\Jismin\\seleniumfilepractice\\seleniumfile.xlsx");
		FileInputStream fi=new FileInputStream(Excel); 


		XSSFWorkbook w = new XSSFWorkbook(fi); 
		XSSFSheet s=w.getSheetAt(0);
		Row r;

		int roenum=s.getLastRowNum();
		for(int i=0;i<roenum;i++) {
			r=s.getRow(i);
			int cellcount= r.getLastCellNum();
			for(int j=0;j<cellcount;j++) {
				Cell cell=r.getCell(j);
				data=cell.toString();
				System.out.print(data +" ");
				System.out.println();
			}
		}

		return data;

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
