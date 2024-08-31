package April.may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClasses {

	@Test()
	public void logins() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.autorox.co:9443/axuat/login");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys("saicar");
		driver.findElement(By.xpath("//*[@id=\"password_login\"]")).sendKeys("Sairam@123");
		WebElement submit = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button"));
		ac.moveToElement(submit).click().build().perform();
		Thread.sleep(2000);
		WebElement Menu = driver.findElement(By.xpath("//img[@id='sideLogo_img']"));
		WebElement Parts = driver.findElement(By.xpath("(//span[@class='sideBarTitle'])[4]/span"));
		ac.moveToElement(Menu).click().build().perform();
		ac.moveToElement(Parts).click().build().perform();
		WebElement stock = driver.findElement(By.xpath("//li[@id='partsOption3']"));
		ac.moveToElement(stock).click().build().perform();

	}

}
