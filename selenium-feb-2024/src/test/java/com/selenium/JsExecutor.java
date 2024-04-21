package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsExecutor {
	
	WebDriver driver;
	
	@Test
	public void testJavScript() throws IOException {
		
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("test111@gmail.com");
		
		WebElement passElemenet = driver.findElement(By.id("pass"));
		passElemenet.sendKeys("test123");
		
		WebElement loginElement = driver.findElement(By.name("login"));
		//loginElement.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginElement);
		
		
		js.executeScript("window.scroll(1000, 1000)");	
	}

}
