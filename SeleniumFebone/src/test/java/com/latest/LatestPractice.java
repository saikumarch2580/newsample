package com.latest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LatestPractice { 
	
	WebDriver driver;
	@Test()
	public String randomnumber(int random) {
		Random ran = new Random();
		int a =ran.nextInt(random);
		String str = String.valueOf(a);
		return str;
  
	}
public void country(WebDriver driver, String country) {
	
	this.driver = driver;
	 
	if(country=="India") {
		
		driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("csteam");
		driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Cst@1234");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		driver.findElement(By.xpath("(//img[@class='sidebarIcon'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
		driver.findElement(By.xpath("//input[@id='reg_2']")).sendKeys(randomnumber(110));
		driver.findElement(By.xpath("//input[@id='reg_3']")).sendKeys("tiv");
		driver.findElement(By.xpath("//input[@id='reg_4']")).sendKeys(randomnumber(10039));
		
	}else if(country=="International") {
		driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("Tanzania01");
		driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Admin@2023");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		driver.findElement(By.xpath("(//img[@class='sidebarIcon'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
		driver.findElement(By.xpath("//*[@id=\"plainTextReg\"]")).sendKeys((randomnumber(100000)));
		
	}
}
}
