import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoGenerateNumber {
    public static void main(String[] args) {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Generate a random number
        Random random = new Random();
        int randomNumber = 1000 + random.nextInt(9000);

        // Use the generated number in your test
        String randomNumberAsString = String.valueOf(randomNumber);
        String url = "http://app.autorox.co";

       
        
        driver.get(url);

        

        // Close the browser
        driver.quit();
    }
}