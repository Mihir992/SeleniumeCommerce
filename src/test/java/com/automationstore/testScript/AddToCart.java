package com.automationstore.testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationstore.pages.LoginPage;
import com.automationstore.pages.ShoppingCart;
import com.automationteststore.base.BaseClass;

public class AddToCart extends BaseClass{
	WebDriver driver;
			
	@Test
	public void testAddProductToCart() {
		try {
			driver=BaseClass.launchApp();
			Login login = new Login();
			login.testLogin();
			ShoppingCart sp = new ShoppingCart(driver);
			Thread.sleep(1000);
			sp.moveMouseOnApparelLinkMenu();
			Thread.sleep(1000);
			sp.moveMouseTShirtLinkMenu();
			sp.getPageTitle();
			sp.clickOnRandomProduct();
			}	catch(Exception e) {
			System.out.println(e.getMessage());
			}
		}
}
