package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {zzz

	public static void main(String[] args) {
		
		 WebDriver driver  = new ChromeDriver();
	
         driver.manage().window().maximize();

         driver.get("https://omayo.blogspot.com/");
         
         driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
	    
         driver.getCurrent