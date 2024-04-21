package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckBox {

	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "user" })
	public void setUp(String browser, String user) {
		System.out.println(user);
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	}
	
	@Test
	public void testCheckbox() {

		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();

		WebElement checkBox1Elelement = driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[2]"));
		boolean status = checkBox1Elelement.isSelected();
		System.out.println(status);
		checkBox1Elelement.click();
		boolean status1 = checkBox1Elelement.isSelected();
		System.out.println(status1);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
