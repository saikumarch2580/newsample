package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrames {
	
	@Test()
	public void enterTextInIframes() throws Exception {
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("sairam");
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("sairam13@gmail.com");
		WebElement emailframe = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(emailframe); 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sairam14@gmail.com");
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).clear();
		driver.switchTo().defaultContent(); 
		WebElement Header = driver.findElement(By.xpath("//div[@class='container']/h1"));
		String text = Header.getText();
		System.out.println(text);
	}

}
