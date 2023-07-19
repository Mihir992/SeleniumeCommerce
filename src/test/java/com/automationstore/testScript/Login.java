package com.automationstore.testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationstore.pages.ShoppingCart;
import com.automationstore.pages.LoginPage;
import com.automationteststore.base.BaseClass;

public class Login extends BaseClass{

	WebDriver driver;
	
	@Test
	public void testLogin() {
		try {
			driver=BaseClass.launchApp();
			LoginPage login = new LoginPage(driver);
			Thread.sleep(1000);
			login.navigateToLogin();
			Thread.sleep(1000);
			login.scrollToUsernameTextField();
			Thread.sleep(1000);
			login.enterUsername("testadmin");
			Thread.sleep(1000);
			login.scrollToPasswordTextField();
			login.enterPassword("admin");
			Thread.sleep(1000);
			login.clickOnLoginButton();
			login.getLoginPageTitle();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
