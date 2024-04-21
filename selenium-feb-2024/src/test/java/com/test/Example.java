package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
	
	@BeforeSuite(alwaysRun = true)
	public void setupSuite() {
		System.out.println("TestNG: @BeforeSuite setupSuite");
	}
	
	@AfterSuite
	public void teardownSuite() {
		System.out.println("TestNG: @AfterSuite teardownSuite");
	}
	
	
	@BeforeTest
	public void setupTest() {
		System.out.println("TestNG: @BeforeTest setupTest");
	}
	
	@AfterTest
	public void teardownTest() {
		System.out.println("TestNG: @AfterTest teardownTest");
	}
	
	
	@BeforeClass
	public void setupClass() {
		System.out.println("TestNG: @BeforeClass setupClass");
	}
	
	@AfterClass
	public void teardownClass() {
		System.out.println("TestNG: @AfterClass teardownClass");
	}
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("TestNG: @BeforeMethod setup");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("TestNG: @AfterMethod teardown");
	}
	
	
	@Test
	public void testAssert() {
		System.out.println("TestNG: testAssert");
	}
	
	
	@Test
	public void test2() {
		System.out.println("TestNG: test2");
	}
	
	@Test
	public void test1() {
		System.out.println("TestNG: test1");
	}

}


// pre-requisites