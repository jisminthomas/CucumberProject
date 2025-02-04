package StepDefinitions;

import com.crm.Pages.HomePage;
import com.crm.Pages.LaunchPage;
import com.crm.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LoginStepDefinition

{
	LaunchPage lp = new LaunchPage();
	LoginPage login;
	HomePage hp;

	@Given("Application is launched")
	public void application_is_launched() 
	{
		lp.verifyApplicationLaunchPage();
	}

	@When("^User enters (.*) and (.*) and click login button$")

	public void login(String username, String password) 
	{
		login = lp.navigateToLoginPage();
		login.verifyField();
		login.enterthecredentials(username, password);
		hp = login.clickLoginBtn();

	}

	@And("user can see all option")
	public void er()
	{

	}

	@Then("User is navigated to the Home page")
	public void verifyHomePage() 
	{
		hp.verifyApplicationinhome();
	}


}
