package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFramehandle {
	
	@Test
	public void testFrame() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		String text1 = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div")).getText();
		System.out.println(text1);
	}
	
	@Test
	public void testNetstedFrame() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		String text1 = driver.findElement(By.xpath("//p")).getText();
		System.out.println(text1);
		
		
		driver.switchTo().defaultContent();
		String text2 = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text2);
	}

}


// Selenium 
// TestNG -- DataProvider
// RestAssured
// Cucumber BDD
// Page Object Model Concepts
// Git/Github

