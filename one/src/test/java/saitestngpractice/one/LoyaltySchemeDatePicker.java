package saitestngpractice.one;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test()
public class LoyaltySchemeDatePicker {
	 

		@SuppressWarnings("unlikely-arg-type")
		public void datepicker() throws Exception {
			
			WebDriver driver = new ChromeDriver();

				
			//login
			//driver.get("https://www.autorox.co:9443/axuat/");
       		driver.get("https://app.autorox.co");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("csteam");
			driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Cst@1234");
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"sideLogo_img\"]")).click();
			driver.findElement(By.xpath("//li[@id='loyalityOpen']")).click();
			driver.findElement(By.xpath("//span[contains(text(), 'Loyalty Scheme')]")).click();
			
			/*List<WebElement> links = driver.findElements(By.tagName("a"));		
			for(int i=0; i<links.size(); i++ ) {
				System.out.println(links.size());				
			WebElement alllinks = links.get(i);				
				System.out.println(alllinks); 
				String link = alllinks.getAttribute("href");
				System.out.println(link); 
				URL lik = new URL(link);
			} */
			 
			
			String url = driver.getCurrentUrl();
			System.out.println(url); 
			String arr[] =driver.findElement(By.xpath("//*[@id=\"loyalityOpen\"]/a")).getAttribute("href").split("serviceticket/bookAppointment");
	        String arr1 = arr[0]+"workshop/manageScheme"+arr[1];
	        System.out.println(arr1);
	        driver.navigate().to(arr1); 
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[@id='wrapper']")).click();
	        driver.findElement(By.xpath("//*[@id=\"package_settings\"]/div/div[1]/div[1]/div/div[3]/div[1]/div[1]/span/input")).sendKeys("Sai package");
	        driver.findElement(By.xpath("//*[@id=\"package_settings\"]/div/div[1]/div[1]/div/div[3]/div[1]/div[3]/div/label")).click();
	        //Calander selection from and to 
	        driver.findElement(By.xpath("//*[@id=\"__BVID__390__value_\"]")).click();	        
	        driver.findElement(By.xpath("//*[@id=\"__BVID__392__cell-2023-10-31_\"]")).click();
	        //to calander
	        driver.findElement(By.xpath("//*[@id=\"__BVID__393__value_\"]")).click();
	        String expdate = "December 2023";
	        //String expdate = driver.findElement(By.xpath("//header[text()='December 2023']")).getText();
	        String curdate = driver.findElement(By.xpath("//header[text()='October 2023']")).getText();
	        
	        while(true) { 
	        	
	        	if(expdate.equals(curdate)) {
	        			
	        		break;
	        		  
	        	}else {
	        		Thread.sleep(1000);	
	        		driver.findElement(By.xpath("//*[@id=\"__BVID__395__calendar-nav_\"]/button[4]/div")).click();
	        		
	        	}
	        		
	        	
	        	
	        }
	        
	        
		       
				    
		}
}