package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id = "searchInputId")
	private WebElement searchInput;
	
	@FindBy(css = "button[data-automation-id='searchIconBlock']")
	private WebElement searchButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchProduct(String productName) {
		searchInput.sendKeys(productName);
		searchButton.click();
	}
	
}
