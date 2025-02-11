package StepDefinitions;

import com.crm.Pages.ContactPage;
import com.crm.Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageSteps {

	HomePage hp = new HomePage();
	ContactPage cp = new ContactPage();
	
		//when tag
		@When("User clicks on Contact button")

		public void contact_click() 
		{
			cp=hp.clickContactButton();

		}

	
		@Then("Verify Create button and Export button is present in Contact page")
		public void verify_Createbutton_ExportButton() throws InterruptedException 
		{
			cp.verifyContactPage();
			cp.selectContactPageValues();
		}
	
}
