package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {


    public static void main (String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/r.php");

        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));
        WebElement year = driver.findElement(By.id("year"));

        /*Select select = new Select(month);
        select.selectByVisibleText("Jul");

        Select selectDay = new Select(day);
        selectDay.selectByVisibleText("15");

        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("1991");
         */
        selectValueFromDropdown(day,"15");
        selectValueFromDropdown(month,"Jul");
        selectValueFromDropdown(year,"1991");

        getDropdownValues(day);
        getDropdownValues(month);
        getDropdownValues(year);
    }

    public static void selectValueFromDropdown(WebElement element, String value) {

        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static void getDropdownValues(WebElement element) {

        Select select = new Select(element);
        List<WebElement> dropdownlist = select.getOptions();
        System.out.println("total number of values in dropdown: " +dropdownlist.size());

         for (int i=0; i<dropdownlist.size(); i++) {

             String text = dropdownlist.get(i).getText();
             System.out.println(text);

         }


    }
}
