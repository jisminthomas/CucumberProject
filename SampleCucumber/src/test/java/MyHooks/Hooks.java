package MyHooks;

import java.io.IOException;

import com.crm.base.TestBase;

import io.cucumber.java.Before;

public class Hooks extends TestBase

{
	@Before
	public void browserInitialization() throws IOException
	{
		init();
		loadProperty();
		launchApp();
	}

}
