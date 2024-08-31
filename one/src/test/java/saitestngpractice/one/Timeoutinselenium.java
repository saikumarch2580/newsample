package saitestngpractice.one;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeoutinselenium {

	@Test()
	public void timeout() {
		
		WebDriver driver = new ChromeDriver();
		
		Instant beforeTime = Instant.now();
		System.out.println(beforeTime.toString());	
		driver.manage().timeouts().pageLoadTimeout(9, TimeUnit.SECONDS);
	    driver.get("https://app.autorox.co");
	    driver.manage().window().maximize();	    	    		
	    Instant AfterTime = Instant.now();
		System.out.println(AfterTime); 
	    Duration Distance = Duration.between(beforeTime, AfterTime);	
		System.out.println(Distance.toMillis());
	}
	
	
	
}
