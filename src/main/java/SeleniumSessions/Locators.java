package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main (String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/");

        Thread.sleep(5000);

        //driver.findElement(By.className("yt-simple-endpoint style-scope ytd-button-renderer")).click();

        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("test@gmail.com");

    }

}
