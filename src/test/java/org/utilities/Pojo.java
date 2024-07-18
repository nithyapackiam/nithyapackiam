package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass{
	
	
	public Pojo() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(name="pass")
	private WebElement txtPass;
	
	
	@FindBy(name="login")
	private WebElement btnLog;


	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}


	public WebElement getBtnLog() {
		return btnLog;
	}


	public void setBtnLog(WebElement btnLog) {
		this.btnLog = btnLog;
	}
		
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forpass;
	
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement email;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;


	public WebElement getForpass() {
		return forpass;
	}


	public void setForpass(WebElement forpass) {
		this.forpass = forpass;
	}


	public WebElement getEmail() {
		return email;
	}


	public void setEmail(WebElement email) {
		this.email = email;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	

	

}
