package com.latest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LatestPracticeOne extends LatestPractice{
	
	
	@Test()
	public void createlogin()  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		country(driver, "International");
		
	}
}
