package com.qafox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownPractice {

	@Test()
	public void dropdown() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		WebElement options = driver.findElement(By.id("drop1"));
		
		Select select = new Select(options);
		List<WebElement> list = select.getOptions();
		
		int s =  list.size();
		System.out.println(s);
		
		for(WebElement m : list) {
			System.out.println(m.getText());
		
			
			
			
		}
		
	}
}
