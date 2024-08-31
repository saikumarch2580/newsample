package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class siblingIframes {
	
	@Test()
	public void silbingframe() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		WebElement left = driver.findElement(By.xpath("//body[contains(text(), 'LEFT')]"));
		String leftText = left.getText();
		System.out.println(leftText);
		//Navigate to Middle Frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		WebElement Middle = driver.findElement(By.xpath("//div[contains(text(), 'MIDDLE')]"));
		String MiddleText = Middle.getText();
		System.out.println(MiddleText);
		//Navigate to Right frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");     
		WebElement Right = driver.findElement(By.xpath("//body[contains(text(), 'RIGHT')]"));
		String RightText = Right.getText();
		System.out.println(RightText);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		WebElement bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		String BottomText = bottom.getText();
		System.out.println(BottomText);
		
	}

}
