package com.automationstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationteststore.base.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@class='form-group']//input[@id='loginFrm_loginname']")
	private WebElement txtboxUsername;
	
	@FindBy(xpath="//div[@class='form-group']//input[@id='loginFrm_password']")
	private WebElement txtboxpassword;
	
	@FindBy(xpath="//form[@id='loginFrm']/fieldset/button")
	private WebElement loginButton;
	
	
	public void clickOnUsernameTextField() {
		txtElementClick(txtboxUsername);
	}
	
	public void enterUsername(String uid) {
		enterText(txtboxUsername,uid);
	}
	
	
	public void clickOnPasswordTextField() {
		txtElementClick(txtboxpassword);
	}
	
	public void enterPassword(String pwd) {
		enterText(txtboxpassword,pwd);
	}

	public void clickOnLoginButton() {
		btnClick(loginButton);
	}
	
	public void getLoginPageTitle() {
		getTitle(driver);
	}
}
