package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "email")
	private WebElement emailInput;
	
	@FindBy(id = "cartSignInPassword")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//button[span[text()='Sign In']]")
	private WebElement loginButton;
	
	@FindBy(css = "button[data-automation-id='at-continue-as-guest']")
	private WebElement guestButton;
	
	public void continueAsGuest() {
		guestButton.click();
	}
	
	public void login(String email, String password) {
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
		loginButton.click();
	}
}
