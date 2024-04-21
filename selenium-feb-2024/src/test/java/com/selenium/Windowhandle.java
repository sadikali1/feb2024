package com.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle {
	
	@Test
	public void windowHanlde() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("tabButton")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> windowId = driver.getWindowHandles();
		
		for (String id : windowId) {
			driver.switchTo().window(id);
		}
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("windowButton")).click();
		
	}
	
	@Test
	public void testWindoworTab() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demoqa.com/elements");
		
	}

}
