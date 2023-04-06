package com.sample.stepdef;

import io.cucumber.java.en.*;

public class LoginStepDef {
	
	@Given("^User load the application url$")
	public void user_load_the_application_url() {
		System.out.println("11111111");
	}
	
	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
		System.out.println("inside when");
	}
	
	@Then("^user validates sucess message$")
	public void user_validates_sucess_message() {
		System.out.println("inside Then");
	}

	@Given("^User load the application url1$")
	public void user_load_the_application_url1() {
		System.out.println("Background=====11111=======");
	}
	
	@When("^user enter username and password1$")
	public void user_enter_username_and_password1() {
		System.out.println("Background=====2222=======");
	}
	
	@When("^user clicks submit buttons$")
	public void user_clicks_submit_buttons() {
		System.out.println("=====clicks=======");
	}
	
	
	@When("^user enter username and password as \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_clicks_submit_buttons(String admin_user,String admin_pass) {
		System.out.println("=====username======="+admin_user);
		System.out.println("=====password======="+admin_pass);
	}
}
