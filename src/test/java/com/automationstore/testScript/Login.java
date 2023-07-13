package com.automationstore.testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationstore.pages.LoginPage;

public class Login extends Home{

	WebDriver driver;
	

	@Test
	public void testLogin() throws InterruptedException {
	
		//driver = BaseClass.launchApp();
		LoginPage login = new LoginPage(driver);
		//FileReader reader=new FileReader("Configuration//Config.properties");
		//Properties props=new Properties();
        //props.load(reader);
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(3000);
        login.clickOnUsernameTextField();
		Thread.sleep(1000);
		login.enterUsername("testadmin");
		Thread.sleep(1000);
		//login.moveToPasswordTextField();
		login.clickOnPasswordTextField();
		Thread.sleep(1000);
		login.enterPassword("admin");
		Thread.sleep(1000);
		login.clickOnLoginButton();
		login.getLoginPageTitle();
		
	}
}