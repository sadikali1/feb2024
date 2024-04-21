package com.jcpenny.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.pages.SignInPage;
import com.utils.BaseTest;

public class CheckOutWithExistingUser extends BaseTest {
	
	@Test
	public void testCheckOutWithExistingUser() {
		String productName = "Home Expressions Harper Bedspread";

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.searchProduct(productName);
		
		ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
		productDetailsPage.verifyProduct(productName);
		
		productDetailsPage.addToCart();
		productDetailsPage.checkout();
		
		CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
		cartPage.verifyProduct(productName);
		cartPage.checkout();
		
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.login(userEmailAddress, password);
	}

}

// POM Page Object Model

// 5 members 

// source code management tools -- git, svn, bitbucket, etc

// Git -- Github, Gitlab, Bitbucket
