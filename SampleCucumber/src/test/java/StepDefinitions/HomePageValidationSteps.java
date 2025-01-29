package StepDefinitions;
import com.crm.Pages.CalendarPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.LaunchPage;
import com.crm.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageValidationSteps {

	
		HomePage hp = new HomePage();
		CalendarPage calpg;
		
					 
			@When("User clicks on Calendar button")
			public void calendar_click() 
			{
				calpg=hp.clickCalendartButton();

			}

			@Then("Verify Events button and Create button is present in Calendar page")
			public void verify_Eventbutton_CreateButton() 
			{
				calpg.verifyCalendarPage();
			}
		
}
