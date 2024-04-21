package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Buttons {

	@Test
	public void testButton() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", doubleClickButton);
		
		action.doubleClick(doubleClickButton).build().perform();
		
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightClickButton).build().perform();
		
		
		WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(singleClick).build().perform();
		driver.quit();
	}
}
