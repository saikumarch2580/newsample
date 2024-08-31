package saitestngpractice.one;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "credentialsdata")
public class BaseclasstestNG {
	
	public void credentilas(WebDriver driver,String username, String password) {
       
		
		driver.findElement(By.xpath("userName_login")).sendKeys(username);
		driver.findElement(By.xpath("password_login")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/nav/div/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/nav/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/button[4]")).click();
		
		
		
		
	}
@DataProvider

	public Object[][] credentialsdata() {
		
		Object[][] data = new Object[2][2];
		
		data[0][1]	= "generaluat";
		data[1][0] = "Sairam@123";
		
		data[1][0] = "saicar";
		data[0][1]= "Sairam@123";
		return data;
		
		
				
				
	
	
	
	}
}
