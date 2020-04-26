package basics.selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleSearch {

    public static void main(String[] args) throws MalformedURLException {

        // launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // URL data type for storing the url information
        URL googleUrl = new URL("http://www.google.com");

        driver.navigate().to(googleUrl);

        // type data in the input search field
        // browser
        // element - the input text field
        // action -- enter data into the input field.
        // data: cars

        // browser  + element + action (+data)
        driver.findElement(By.name("q")).sendKeys("cars");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        //driver.findElement(By.name("btnK")).click();


    }

}
