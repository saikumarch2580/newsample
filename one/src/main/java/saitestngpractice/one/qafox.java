package saitestngpractice.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class qafox {

	@Test
	public void openqafox() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
	List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='table1']//tbody"));
	for(int i = 0; i<tabledata.size(); i++) {
		
	String options = tabledata.get(i).getText();
	System.out.println(options);
	
	
	
	List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='multiselect1']"));
	
	for(int j=0; j<dropdown.size(); j++) {
		String dp = dropdown.get(j).getText();
		System.out.println(dp);
			
		}
		
		
	
	}}
	
	
	
	
	
		
	
		
		
	
	
	
		
		
		
		
		
	}
	

