package com.automationstore.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationteststore.base.BaseClass;

public class ShoppingCart extends BaseClass {
	
	WebDriver driver;

	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='categorymenu']/nav/ul/li[2]/a")
	private WebElement linkApparelMenu;
	
	@FindBy(xpath="//*[@id='categorymenu']/nav/ul/li[2]/div/ul[1]/li[2]/a")
	private WebElement linkTshirtMenu;
	
	@FindBy(xpath="//div[contains(@class, 'jumbotron')]//i")
	private List<WebElement>lstProductNameText;
	
	
	public void moveMouseOnApparelLinkMenu() {
		moveToElement(driver, linkApparelMenu);
	}
	
	public void moveMouseTShirtLinkMenu() {
		moveToElement(driver, linkTshirtMenu);
		linkTshirtMenu.click();
	}
	
	public String getPageTitle() {
		return getTitle(driver);
	}
	
	public void clickOnRandomProduct() {
//		return clickOnProductRadomly(lstProductNameText,driver);
		int min = 0;
		int max = lstProductNameText.size()-1;
		int randomNum = min + (int)(Math.random() * max);
		btnClick(lstProductNameText.get(randomNum));
	}
	
}
