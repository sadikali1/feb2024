package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetDriverMethod {

	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getPageSource());
		
		driver.quit();
		
	}
}
