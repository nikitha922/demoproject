package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotwo {

	public static void main(String[] args) {
		
		 WebDriver driver  = new ChromeDriver();
	
         driver.manage().window().maximize();

         driver.get("https://www.edureka.co/");
         
         driver.findElement(By.id("DevOps-tab")).click();
         driver.findElement(By.className("ga_trending_course_card")).click();
         
	}
}
