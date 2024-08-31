package April.may;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA {	
	@Parameters ({"url", "username", "password"})	
	@Test()
	public void newlogin(String url, String username, String password) {
	   
	WebDriver driver = new ChromeDriver();
    driver.get(url);
    driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys(username);
    driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys(password);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
     
	
	 

}
}