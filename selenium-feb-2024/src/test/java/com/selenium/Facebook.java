package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	
	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("test111@gmail.com");
		
		WebElement passElemenet = driver.findElement(By.id("pass"));
		passElemenet.sendKeys("test123");
		
		WebElement loginElement = driver.findElement(By.name("login"));
		loginElement.click();
		
		driver.quit();
	}

}


// element 
// element locator - id, name, className, tagName, linkText, partialLinkText, xpath, cssSelector