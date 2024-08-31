package com.emailtestcase;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlineProduct {
	
	WebDriver driver;
	@Test(priority =1)
	public void login() {
		
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
	@Test(dependsOnMethods= {"login"}) 
	public void emailvalidation() {
		
		driver.findElement(By.xpath("//input[@id ='input-email']")).sendKeys("sairamch2580@gmail.com");
		driver.findElement(By.xpath("//input[@id ='input-password']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed());		
	}
		@Test(dependsOnMethods= {"login", "emailvalidation"})
		public void selectProduct() throws Exception {
			driver.findElement(By.xpath("//input[@name='search']")).click();
			driver.findElement(By.xpath("//input[@name='search']")).sendKeys("hp", Keys.ENTER);
			driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
	        driver.findElement(By.xpath("//*[@id=\"product-search\"]/div[1]/a[2]")).click();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	        Assert.assertTrue(driver.findElement(By.xpath("data-original-title")).isDisplayed());
			
			
			
			
		}
	}


