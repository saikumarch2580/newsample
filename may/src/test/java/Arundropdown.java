import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arundropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		List<WebElement> elements = driver.findElements(By.xpath("//select[@id='drop1']/option"));
		Map<String, String> map = new HashMap<>();
		int i = 1;

		for (WebElement element : elements) {

			map.put("Option" + i, element.getText());
			i++;

		} 

		 System.out.println(map.values());

		 System.out.println(map.keySet());

		System.out.println(map.entrySet());

		/*
		 * for(Entry<String, String> entry : map.entrySet()) {
		 * System.out.println(entry.getKey()+":"+entry.getValue()); }
		 */

		/*
		 * for(String k : map.keySet()) {
		 * 
		 * System.out.println(k+":"+map.get(k));
		 * 
		 * }
		 */

		//driver.quit();

	}

}
