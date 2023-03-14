package demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class democlass {
	
   public static void main(String[] args) {
		
		
		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the Amazon website
		driver.get("https://www.amazon.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Close the browser
		driver.quit();
	}
}

