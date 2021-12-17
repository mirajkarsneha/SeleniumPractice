package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshot {
    public static void main (String[] args ) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://app.hubspot.com/login");
        //implicitly wait is only for web elements
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        takeScreenShot(driver, "loginpage");

    }

    public static void takeScreenShot(WebDriver driver, String filename) {

        File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(SrcFile, new File("./src/test/resources/screenshots/"+filename+".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
