package steps;

import io.cucumber.java.en.*;

public class StepDefinition {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("I am inside login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("User enters valid credentials");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("User clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User is navigated to the home page");
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		System.out.println("user enters invalid credentials");
	}

	@Then("error message is displayed - Invalid credentials")
	public void error_message_is_displayed_invalid_credentials() {
		System.out.println("Error message is displayed");
	}
}
