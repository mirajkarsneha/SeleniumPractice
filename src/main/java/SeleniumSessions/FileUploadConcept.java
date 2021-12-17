package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {
    public static void main (String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

        Thread.sleep(5000);

        driver.findElement(By.name("upfile")).sendKeys("/Users/rishikeshdhokare/Downloads/Subscribers.jpeg");
    }
}
