package org.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.Pojo;

import cucumber.api.java.en.*;


public class ForgottonStep extends BaseClass {
	
	@Given("user should open the chrome and the url")
	public void user_should_open_the_chrome_and_the_url() {
	    
	browserlaunch();
	launchurl("https://www.facebook.com/");
	maxWindow();
	}

	@When("user should click the forgotten password link")
	public void user_should_click_the_forgotten_password_link() throws InterruptedException {
		Pojo l=new Pojo();
		WebElement forpass = l.getForpass();
		forpass.click();
		Thread.sleep(1000);
	   
	}
	
	@When("user should enter invalid username or password")
	public void user_should_enter_invalid_username_or_password() {
		Pojo l=new Pojo();
		WebElement email = l.getEmail();
		email.sendKeys("Jeevan@98");
	}

	@Then("validate user should navigate to password reset page")
	public void validate_user_should_navigate_to_password_reset_page() {
	    
	String actual = driver.getTitle();
	
	Assert.assertTrue(actual.contains("Locator"));
	System.out.println("pass");
	}

	
	@When("user should click search button")
	public void user_should_click_search_button() {
		Pojo l=new Pojo();

		WebElement submit = l.getSubmit();
		submit.click();
		
		
	    
	}

	


	}
