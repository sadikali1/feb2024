package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "div[data-automation-id='ocProductTitle'] > a > span")
	private WebElement cartProductTitle;
	
	@FindBy(css = "button[data-automation-id='at-remove-item-link']")
	private WebElement removeItemLink;
	
	@FindBy(css = "button[data-automation-id='test-automation-btn-checkout']")
	private WebElement checkoutButton;
	
	public void checkout() {
		checkoutButton.click();
	}
	
	public void verifyProduct(String productName) {
		String actualCartProductTitle = cartProductTitle.getText();
		Assert.assertEquals(actualCartProductTitle, productName);
	}
	
	public void removeItem() {
		removeItemLink.click();
	}

}
