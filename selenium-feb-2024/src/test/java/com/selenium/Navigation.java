package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {

	WebDriver driver;

	@Test
	public void testNavigate() throws IOException, InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("test111@gmail.com");

		WebElement passElemenet = driver.findElement(By.id("pass"));
		passElemenet.sendKeys("test123");

		WebElement loginElement = driver.findElement(By.name("login"));
		loginElement.click();
		
		//driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
}

// Page Object Model -- GitHub

// Cucumber framework
	// BDD framework

// TestNG framework
	// TDD framework
