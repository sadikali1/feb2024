package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage {
	
	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "productTitle-false")
	private WebElement productTitle;
	
	@FindBy(css = "p[data-automation-id='addToCart']")
	private WebElement addToCartButton;
	
	@FindBy(css = "button[data-automation-id='at-panel-checkout-button']")
	private WebElement checkoutButton;
	
	
	public void verifyProduct(String productName) {
		String actualProductTitle = productTitle.getText();
		Assert.assertEquals(actualProductTitle, productName);
	}
	
	public void addToCart() {
		addToCartButton.click();
	}
	
	public void checkout() {
		checkoutButton.click();
	}
}
