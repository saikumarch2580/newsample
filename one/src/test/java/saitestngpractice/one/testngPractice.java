package saitestngpractice.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngPractice {

	@Test(dataProvider = "getCredentials")
	public void openApplication(String username, String password) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.autorox.co:9443/axuat/");

		driver.findElement(By.xpath("//*[@id=\"userName_login\"]")).sendKeys(username);
		driver.findElement(By.id("password_login")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/nav/div/div[2]/div/div/div[1]")).click();
		driver.findElement(
				By.xpath("//*[@id=\"topnav\"]/div/nav/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/button[4]"))
				.click();

	}

	@DataProvider
	public String[][] getCredentials() {

		String[][] data = new String[][] { 
			{ "saicar", "Sairam@123" }, { "generaluat", "Sairam@123" }, {"saikumar", "Sairam@123"}

		};

		return data;

	}

}
