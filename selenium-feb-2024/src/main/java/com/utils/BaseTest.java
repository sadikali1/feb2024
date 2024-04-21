package com.utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	protected String appUrl;
	protected String userName;
	protected String password;
	protected String userEmailAddress;
	
	
	
	@BeforeMethod
	public void setup() throws IOException {
		appUrl = Config.getConfig("Url");
		userName = Config.getConfig("UserName");
		password = Config.getConfig("UserPassword");
		userEmailAddress = Config.getConfig("UserEmail");
		
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Closing the browser");
	}

}
