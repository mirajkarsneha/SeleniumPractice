package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerConcept {

    public static void main (String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        Thread.sleep(5000);

        driver.findElement(By.name("proceed")).click();

        // Alert popup concept
        Alert alert = driver.switchTo().alert();

        String text = alert.getText();

        System.out.println(text);

        if (text.equals("Please enter a valid user name"))
        {
            System.out.println("Correct name");
        }
        else {
            System.out.println("Incorrect name");
        }

        Thread.sleep(5000);

        alert.accept();
    }
}
