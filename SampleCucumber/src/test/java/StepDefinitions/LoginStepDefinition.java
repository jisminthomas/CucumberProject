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

	@When("^User enters (.*) and (.*) and click log in  button$")

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

	/*
	 * @Given("Application is launched") public void application_is_launched() {
	 * lp.verifyApplicationLaunchPage(); }
	 * 
	 * @When ("User click on the login button") public void
	 * user_click_on_the_login_button() { lp.navigateToLoginPage(); }
	 * 
	 * @When("^User enters (.*) and(.*)$") public void
	 * user_enters_name_and_password(String user, String password) {
	 * login.enterthecredentials(user, password); }
	 * 
	 * 
	 * 
	 * @Then("User is navigated to the Home page") public void
	 * user_navigate_homepage() { hp.verifyApplicationinhome(); }
	 * 
	 * @Then("Verify the login page have all fields") public void
	 * verify_login_page_fields() { login.verifyField(); }
	 * 
	 * 
	 */
}
