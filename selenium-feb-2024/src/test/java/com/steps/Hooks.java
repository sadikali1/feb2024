package com.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	static WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("I am a setup method");
	}

	
	@After
	public void tearDown() {
		System.out.println("I am a tear down method");
		driver.quit();
	}

}
