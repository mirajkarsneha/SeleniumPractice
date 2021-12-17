package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

    public static void main (String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://mrbool.com");

        Actions actions = new Actions(driver);

        WebElement contentLink = driver.findElement(By.className("menulink"));

        actions.moveToElement(contentLink).build().perform();

        Thread.sleep(5000);

        driver.findElement(By.linkText("COURSES")).click();
    }
}
