package MyHooks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.base.TestBase;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestBase

{
	@Before
	public void browserInitialization() throws IOException
	{
		init();
		loadProperty();
		ReadExcel();
		launchApp();
	}
	
	
	@After
	public void takeScraenshotOnFailure(Scenario scenario) {

		if (scenario.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");

		}
	}
	
	/*
	 * @After public static void writeExtentReport() { Reporter.loadXMLConfig(new
	 * File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath())
	 * ); }
	 */

}
