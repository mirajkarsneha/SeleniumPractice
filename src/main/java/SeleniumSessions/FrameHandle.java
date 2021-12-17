package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
    public static void main (String[] args )  {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.londonfreelance.org/courses/frames/index.html");

        WebElement frameElement = driver.findElement(By.name("main"));

        driver.switchTo().frame(frameElement);

        String text = driver.findElement(By.cssSelector("body > h2")).getText();

        System.out.println(text);

        driver.switchTo().defaultContent(); //back

        driver.switchTo().parentFrame();



    }
}
