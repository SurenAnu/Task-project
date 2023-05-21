package org.Globel_Stepdefinition;

import org.Base_Class.Base_Classes;
import org.Globel_Runner.Runner_class;
import org.Home_Page.Home_Pages;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Classes{
	
	public static WebDriver driver = Runner_class.driver;
	
	Home_Pages home = new Home_Pages(driver);
	
	
	
	
	@Given("user lanch the global application")
	public void user_lanch_the_global_application() {
		url(driver, "https://www.globalsqa.com/samplepagetest/");
	}

	
	@When("user enter the name in name required field")
	public void user_enter_the_name_in_name_required_field() {
		sendke(home.getName(), "surendhar");
	}

	@When("user enter the Email id in email required field")
	public void user_enter_the_email_id_in_email_required_field() {
		sendke(home.getMail(), "surendhar@gmail.com");
	}

	@When("user enter the uers's website in website field")
	public void user_enter_the_uers_s_website_in_website_field() {
		sendke(home.getUrl(), "www.surendhar.com");
	}

	@When("user select experience in experience field")
	public void user_select_experience_in_experience_field() {
		seltext(home.getExper(), "0-1");
	}

	@When("user choose Expertise in field")
	public void user_choose_expertise_in_field() {
	}

	@When("user choose education in education field")
	public void user_choose_education_in_education_field() {
	}

	@Then("user click alert box it is redirects to confirm alert")
	public void user_click_alert_box_it_is_redirects_to_confirm_alert() {
	}
}