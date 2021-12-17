package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

    public static void main (String[] args ) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.navigate().to("http://www.amazon.in/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().back();

        driver.navigate().refresh();

    }
}
