package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test(priority = 1)
	public void addProduct() {
		System.out.println("TestNG: @Test addProduct");
		Assert.assertEquals(1, 2);
    
	}
	
	@Test(priority = 0, dependsOnMethods = "addProduct", alwaysRun = true)
	public void editProduct() {
		System.out.println("TestNG: @Test editProduct");
	}
	
	@Test(dependsOnMethods = {"addProduct", "editProduct"})
	public void deleteProduct() {
		System.out.println("TestNG: @Test deleteProduct");
	}
	

}


// TestNG DataProvider  DataDriven Testing