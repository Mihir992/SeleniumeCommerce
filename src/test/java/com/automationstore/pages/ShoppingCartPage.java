package com.automationstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationteststore.base.BaseClass;

public class HomePage extends BaseClass {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Login or register']")
	private WebElement btnlogin;
	
	//@FindBy(xpath="//img[@alt='Automation Test Store']")
	//private WebElement imgLogo;

	//@FindBy(xpath="//input[@placeholder='Search Keywords']")
	//private WebElement searchQuery;

	public void clickOnSignIn() {
		btnClick(btnlogin);
	}
}
