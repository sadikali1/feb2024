package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureScreen {
	WebDriver driver;
	
	@Test
	public void testpageScreen() throws IOException {
		
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.cssSelector("img[alt='Facebook']"));
		File file1 =  element.getScreenshotAs(OutputType.FILE);
		File file2 = new File("logo.png");
		FileUtils.copyFile(file1, file2); 
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("test111@gmail.com");
		
		WebElement passElemenet = driver.findElement(By.id("pass"));
		passElemenet.sendKeys("test123");
		
		WebElement loginElement = driver.findElement(By.name("login"));
		loginElement.click();
		
		
		/*
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File file1 = scrShot.getScreenshotAs(OutputType.FILE);
		File file2 = new File("screenshot.png");
		FileUtils.copyFile(file1, file2); */
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File file1 = scrShot.getScreenshotAs(OutputType.FILE);
			File file2 = new File("screenshot.png");
			try {
				FileUtils.copyFile(file1, file2);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}
}
