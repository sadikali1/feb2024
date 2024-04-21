package com.test;

import org.testng.annotations.Test;

public class TestAttributes {

	@Test(priority = 2, description = "This is a test method with priority 2 and description")
	public void testTest3() {
		System.out.println("TestNG: @Test testTest3");

	}

	@Test(priority = 3)
	public void testTest4() {
		System.out.println("TestNG: @Test testTest4");

	}

	@Test(priority = 2, enabled = false)
	public void testTest1() {
		System.out.println("TestNG: @Test testTest1");

	}

	@Test(priority = 1)
	public void testTest2() {
		System.out.println("TestNG: @Test testTest2");

	}
}


// Add Product
// Edit Product
// Delete Product
