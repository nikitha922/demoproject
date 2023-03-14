package demoproject;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prjct {
    WebDriver driver;

    @Before
    public void setUp() {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        // Open the Amazon website
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void testFashionLink() {
        // Click on the "Fashion" link
        driver.findElement(By.xpath("//a[@href='/Fashion/b/ref=nav_shopall_fashion?ie=UTF8&node=7141123011']")).click();
        // Verify that the page redirects to the correct URL
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/Fashion/b/ref=nav_shopall_fashion?ie=UTF8&node=7141123011";
        Assert.assertEquals(actualUrl, expectedUrl);
        // Open a subelement within the "Fashion" section
        driver.findElement(By.xpath("//a[@href='/Men-Fashion/b/ref=nav_shopall_men_fashion?ie=UTF8&node=7147441011']")).click();
        // Verify that the page redirects to the correct URL
        actualUrl = driver.getCurrentUrl();
        expectedUrl = "https://www.amazon.com/Men-Fashion/b/ref=nav_shopall_men_fashion?ie=UTF8&node=7147441011";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
