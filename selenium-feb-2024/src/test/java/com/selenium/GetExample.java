package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetExample {

	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		String expectedMgs = "Facebook helps you connect and share with the people in your life.";
		
		WebElement element = driver.findElement(By.className("_8eso"));
		String actualMessage = element.getText();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, expectedMgs);
		
		String emailPlaceholder = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(emailPlaceholder);
		Assert.assertEquals(emailPlaceholder, "Email address or phone number");
		
		String passPlaceholder = driver.findElement(By.id("pass")).getAttribute("placeholder");
		System.out.println(passPlaceholder);
		Assert.assertEquals(passPlaceholder, "Password");
		
		
		WebElement elementLogin = driver.findElement(By.name("login"));
		String fontSize = elementLogin.getCssValue("font-size");
		String lineHeight = elementLogin.getCssValue("line-height");
		String width = elementLogin.getCssValue("width");
		System.out.println(fontSize);
		System.out.println(lineHeight);
		System.out.println(width);
		Assert.assertEquals(fontSize, "20px");
		Assert.assertEquals(lineHeight, "48px");
		Assert.assertEquals(width, "332px");
		
		
		
		driver.quit();
	}
}
