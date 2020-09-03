package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_Base;

public class Google_Home extends Page_Base {
	 
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/lruiz/eclipse-workspace/Taller_Cucumber/src/test/resources/browser/chromedriver");
		driver = new ChromeDriver();
	}
	
	public void openGoogleURL() {
		driver.get("http://www.google.com");
	}
		
	public void checkSearchBoxIsDisplayed() {
		if(driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
	}
	
	public void checkGoogleSearchButtonIsDisplayed() {
		if(driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("Google Search button is displayed");
		} else {
			System.out.println("Google Search button is NOT displayed");
		}
	}
	
	public void checkImFeelingLuckyButtonIsDisplayed() {
		if(driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I'm Feeling Lucky button is displayed");
		} else {
			System.out.println("I'm Feeling Lucky button is NOT displayed");
		}
	}
	
	public void closeTheBrowser() {
		driver.quit();
	}
}
