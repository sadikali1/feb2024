package com.test;

import org.testng.annotations.DataProvider;

public class MyData {

	@DataProvider(name = "data")
	public Object[][] getData() {
		Object[][] data = { 
				{ 10, 20, 30 }, 
				{ 20, 30, 50 }, 
				{ 30, 40, 60 }, 
				{ 40, 50, 90 }, 
				{ 50, 60, 110 }
			};
		return data;
	}
}
