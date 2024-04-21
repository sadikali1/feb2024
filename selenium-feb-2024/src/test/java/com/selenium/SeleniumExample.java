package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample {

	public static void main(String[] args) {
		
		System.out.println("Selenium WebDriver Example");
        
        // 1. Open Browser
        // 2. Navigate to URL
        // 3. Find Element
        // 4. Perform Action
        // 5. Close Browser
        
        // 1. Open Browser
         WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();
        // WebDriver driver = new EdgeDriver();
        // WebDriver driver = new SafariDriver();
        
        // 2. Navigate to URL
         driver.get("http://www.google.com");
        
        // 3. Find Element
         WebElement element = driver.findElement(By.name("q"));
        
        // 4. Perform Action
         element.sendKeys("Selenium WebDriver");
         element.submit();
        
        // 5. Close Browser
         driver.quit();
        
    
	}
}





// Java JDK 11
// Eclipse/IntelliJ
// Maven 
// TestNG
// Selenium WebDriver
// Browsers: Chrome, Firefox, Edge, Safari
// ChromeDriver, GeckoDriver, EdgeDriver, SafariDriver -- taken care by Selenium WebDriver


// Selenium WebDriver
// Selenium IDE, Selenium RC, Selenium WebDriver, Selenium Grid

