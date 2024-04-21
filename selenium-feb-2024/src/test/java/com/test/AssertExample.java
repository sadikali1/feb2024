package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {

	@Test
	public void testAssert() {
		System.out.println("TestNG: @Test testAssert");
		int a = 1;
		int b = 2;
		// Assert.assertEquals(a, b);
		Assert.assertEquals(a, b, "a is not equal to b");

		boolean status = true;
		String message = "User login sucessfully";

		Assert.assertTrue(message.contains("sucessfully"), "Login message not contains sucessfully");
		Assert.assertFalse(status, "User login failed");
	}

	@Test
	public void testAssert2() {
		System.out.println("TestNG: @Test testAssert2");
		int a = 1;
		int b = 2;
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(a, b, "a is not equal to b");

		boolean status = true;
		String message = "User login sucessfully";

		softAssert.assertTrue(message.contains("sucessfully"), "Login message not contains sucessfully");
		softAssert.assertFalse(status, "User login failed");
		softAssert.assertAll();
	}

}

// TestNg have two types of assert methods:
// 1. Hard Assert
// 2. Soft Assert

// login
// login success message
