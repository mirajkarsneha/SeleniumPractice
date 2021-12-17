package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowPopUpHandle {

    public static void main (String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://popuptest.com/goodpopups.html");

        driver.findElement(By.linkText("Good PopUp #3")).click();

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it  = handles.iterator();

        String parentWindowId = it.next();
        System.out.println("parent window id is" +parentWindowId);

        String childWindowId = it.next();
        System.out.println("parent window id is" +childWindowId);

        driver.switchTo().window(childWindowId);
        System.out.println("child window is: " +driver.getTitle());

        driver.close();

        driver.switchTo().window(parentWindowId);
        System.out.println("parent window is: " +driver.getTitle());
    }
}
