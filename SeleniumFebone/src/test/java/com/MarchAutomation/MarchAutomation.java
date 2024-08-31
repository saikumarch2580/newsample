package com.MarchAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MarchAutomation {
	
	Properties pro;
	@Test(priority = 1)
	public void propertiesfile() throws Exception {
		
		 pro = new Properties();
		
		File fis = new File("C:\\Users\\Sai Anna\\Desktop\\Eclipse1\\SeleniumFebone\\src\\test\\java\\MarchFile.properties");
		
		FileInputStream fi = new FileInputStream(fis);
		
		pro.load(fi);	
		
		System.out.println(pro.getProperty("url")); 
	
	} 
	
	@Test(priority =2)
public void login() { 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath(pro.getProperty("usernamexpath"))).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath(pro.getProperty("passwordxpath"))).sendKeys(pro.getProperty("password"));
	    driver.findElement(By.xpath(pro.getProperty("click"))).click();
	    
		 
	}
} 
	


