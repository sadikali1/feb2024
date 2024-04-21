package com.jcpenny.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.utils.BaseTest;

public class Search extends BaseTest{
	
	@Test
	public void searchTest() {
		String productName = "Home Expressions Harper Bedspread";

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.searchProduct(productName);
		
		ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
		productDetailsPage.verifyProduct(productName);
	}

}
