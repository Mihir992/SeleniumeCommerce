package com.automationteststore.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//public static Properties prop;
	public static WebDriver driver;
		
	@BeforeTest
	public static WebDriver launchApp() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chromer.driver","C:\\Users\\admin\\eclipseworkspace\\eCommerce\\Driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifcations");
			options.addArguments("--disable-gpu");
			options.addArguments("--disable-extensions");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://automationteststore.com/");
			return driver;
		}
		
		public void txtElementClick(WebElement txtelement) {
			txtelement.click();
		}
		
		public void btnClick(WebElement locator) {
			locator.click();
		}
		
		public void enterText(WebElement locatorText,String text) {
			locatorText.sendKeys(text);
		}
		
		/*public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
			 JavascriptExecutor j = (JavascriptExecutor) driver;
		     j.executeScript("window.scrollBy(0,500)",ele);

		}*/
		
		/*public void click(WebDriver driver, WebElement ele) {
			Actions act = new Actions(driver);
			act.moveToElement(ele).click().build().perform();

		}*/
		
		
		public boolean moveToElement(WebDriver driver, WebElement ele) {
			boolean flag = false;
			try {
				// WebElement element = driver.findElement(locator);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].scrollIntoView(true);", ele);
				Actions actions = new Actions(driver);
				// actions.moveToElement(driver.findElement(locator)).build().perform();
				actions.moveToElement(ele).build().perform();
				flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}

		public boolean mouseover(WebDriver driver, WebElement ele) {
			boolean flag = false;
			try {
				new Actions(driver).moveToElement(ele).build().perform();
				flag = true;
				return true;
			} catch (Exception e) {
				return false;
			} finally {
				/*
				 * if (flag) {
				 * SuccessReport("MouseOver ","MouserOver Action is performed on \""+locatorName
				 * +"\""); } else {
				 * failureReport("MouseOver","MouseOver action is not performed on \""
				 * +locatorName+"\""); }
				 */
			}
		}
		
		public boolean rightclick(WebDriver driver,WebElement ele) {
			boolean flag = false;
			try {
				Actions clicker = new Actions(driver);
				clicker.contextClick(ele).perform();
				flag = true;
				return true;
				// driver.findElement(by1).sendKeys(Keys.DOWN);
			} catch (Exception e) {

				return false;
			} finally {
				if (flag) {
					System.out.println("RightClick Action is performed");
				} else {
					System.out.println("RightClick Action is not performed");
				}
			}
		}
		
		public String getTitle(WebDriver driver) {
			boolean flag = false;

			String text = driver.getTitle();
			if (flag) {
				System.out.println("Title of the page is: \""+text+"\"");
			}
			return text;
		}
		
		public String getCurrentURL(WebDriver driver)  {
			boolean flag = false;

			String text = driver.getCurrentUrl();
			if (flag) {
				System.out.println("Current URL is: \""+text+"\"");
			}
			return text;
		}
		
		@AfterTest
		public void tearDown() {
			driver.close();
			driver.quit();
		}
}