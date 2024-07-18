package org.StepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;
import org.utilities.Pojo;

import cucumber.api.java.en.*;



public class Loginstep extends BaseClass{
	
	
	@Given("user should open the browser and launch the url")
	public void user_should_open_the_browser_and_launch_the_url() {
browserlaunch();
launchurl("https://www.facebook.com/");
maxWindow();	}

	@When("user should enter invalid username and the invalid password")
	public void user_should_enter_invalid_username_and_the_invalid_password() {
		
		Pojo p=new Pojo();
		WebElement txtEmail = p.getTxtEmail();		
txtEmail.sendKeys("nithya");
WebElement txtPass = p.getTxtPass();
txtPass.sendKeys("23456"); 
	}

	@When("user should click login button")
	public void user_should_click_login_button() throws InterruptedException {
		Pojo p=new Pojo();
WebElement btnLog = p.getBtnLog();

btnLog.click();
Thread.sleep(2000);
		
	}
	@When("user should get the title of the page")
	public void user_should_get_the_title_of_the_page() {
	   title();
		
	}

	@When("user should get the current url of the page")
	public void user_should_get_the_current_url_of_the_page() {
	    crturl();
	    }

	@When("user should enter valid username and invalid password")
	public void user_should_enter_valid_username_and_invalid_password() {
		Pojo p=new Pojo();
		WebElement txtEmail = p.getTxtEmail();		
txtEmail.sendKeys("nithya@gmail");
WebElement txtPass = p.getTxtPass();
txtPass.sendKeys("12346098"); 
	    
	}

	@When("user should enter valid username {string} and invalid password{string}")
	public void user_should_enter_valid_username_and_invalid_password(String n, String pa) {
		Pojo p=new Pojo();
		WebElement txtEmail = p.getTxtEmail();		
txtEmail.sendKeys(n);
WebElement txtPass = p.getTxtPass();
txtPass.sendKeys(pa);
		
		}
	@When("user should click button")
	public void user_should_click_button() throws InterruptedException {
		Pojo p=new Pojo();
		WebElement btnLog = p.getBtnLog();

		btnLog.click();
		Thread.sleep(2000);
	
	}
//1D--List
	@When("user should enter invalid username and invalid password")
	public void user_should_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d1) {
		
		List<String> l = d1.asList();
		String username = l.get(2);
		String password = l.get(4);
		Pojo p=new Pojo();
		WebElement txtEmail = p.getTxtEmail();		
txtEmail.sendKeys(username);
WebElement txtPass = p.getTxtPass();
txtPass.sendKeys(password);
		
	}
//2D---List	
	@When("you should enter invalid username and the invalid password")
	public void you_should_enter_invalid_username_and_the_invalid_password(io.cucumber.datatable.DataTable d) {
		List<List<String>> li = d.asLists();
		String username = li.get(0).get(4);
		String password = li.get(2).get(3);
		
		Pojo p=new Pojo();
		WebElement txtEmail = p.getTxtEmail();		
txtEmail.sendKeys(username);
WebElement txtPass = p.getTxtPass();
txtPass.sendKeys(password);
	}
	
		//1D---map
	
	@When("user should enter invalid username field and valid password")
	public void user_should_enter_invalid_username_field_and_valid_password(io.cucumber.datatable.DataTable d2) {
		Map<String, String> mp = d2.asMap(String.class, String.class);
		
		  String username = mp.get("Orange");
		  String password = mp.get("lemon");
			Pojo p=new Pojo();
			WebElement txtEmail = p.getTxtEmail();		
	txtEmail.sendKeys(username);
	WebElement txtPass = p.getTxtPass();
	txtPass.sendKeys(password);
	}
	
	
//2D---Map
	
	@When("user enter Invalid username and Valid password")
	public void user_enter_Invalid_username_and_Valid_password(io.cucumber.datatable.DataTable d3) {
		List<Map<String, String>> mp2 = d3.asMaps();
		String username = mp2.get(2).get("street");
		String password = mp2.get(0).get("city");
		Pojo p=new Pojo();
		WebElement txtEmail = p.getTxtEmail();		
txtEmail.sendKeys(username);
WebElement txtPass = p.getTxtPass();
txtPass.sendKeys(password);
	}
	
	

	@Then("validate user should navigate to incorrect credential page")
	public void validate_user_should_navigate_to_incorrect_credential_page() {
	    
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains("Facebook"));
	System.out.println("pass");
	}



}
