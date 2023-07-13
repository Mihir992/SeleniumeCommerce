package com.automationstore.testScript;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationstore.pages.HomePage;
import com.automationteststore.base.BaseClass;


public class Home{

		WebDriver driver;
		@Test
		public void testnavigateToLogin() throws InterruptedException {
		
			driver = BaseClass.launchApp();
			HomePage home = new HomePage(driver);
			home.clickOnSignIn();
			
		}
		
	}