import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class dropdown {
	@Test()
	public void logins() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.autorox.co/login?logout");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName_login")).sendKeys("Autorox@test");
		driver.findElement(By.id("password_login")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Actions ac = new Actions(driver);
		Thread.sleep(2000); 
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]"));
		Thread.sleep(2000);
		WebElement Jobcard = driver.findElement(By.xpath("//*[@id=\"style-1\"]/ul/li[2]/a/img"));
		
		
		ac.moveToElement(menu).click().build().perform(); 
		ac.moveToElement(Jobcard).click().build().perform();
		
	    driver.findElement(By.xpath("//button[@id='estlater'][2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"select2-stateCode-container\"]")).click();
	    

	      List<WebElement> states = driver.findElements(By.xpath("//span[@class='select2-results']//ul"));
	      Map<String, String> mp = new HashMap<>();
	      
	      
	    
	      for(WebElement state: states) {
	    	  
	    	  
	    	  
	    	  String list = state.getText();
	    	  
	    	  mp.put("States", list);
	    	  
	    	  if(list.equals("AP")) {
	    		   
	    		  
	    		  state.click();
	    	  }
	    	 System.out.println(mp.get("States"));
	      }
	    	  
	     /* for(WebElement i:states) {
	    	   
	    	   System.out.println(i.getText());    	
	    	 
	      mp.put("State", i.getText());
	      }
   
	      mp.entrySet();
	      System.out.print("mp sets are here :"+ mp.entrySet());
	      System.out.println("mp values are here :" +mp.values());
	      System.out.println("New states are here" + mp.get("State")); */
	     
	      
	      
	       
	    		   
	      }    	   
	    	   
	       }
	    

	    	
	    
	    
	    
	
	      
		
		
		
		
		
		
		
	


