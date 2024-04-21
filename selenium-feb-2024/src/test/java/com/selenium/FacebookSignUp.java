package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignUp {

	@Test
	public void testFacebookSignUp() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		
		WebElement signUpButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUpButton.click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.clear();
		firstName.sendKeys("John");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Scott");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("test@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.id("password_step_input"));
		passwordElement.sendKeys("Password");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("10");
		
		Select month = new Select(driver.findElement(By.id("month")));
		//month.selectByVisibleText("Nov");
		month.selectByIndex(0);
		
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("2016");
       // year.selectByIndex(5);
        
        
	}
}

// wait 
// implicit wait
// explicit wait
