package MyPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

    public static void main(String[] args) throws MalformedURLException {
        subclass();
        System.out.println("Open browser" );

    }


    public static void subclass() throws MalformedURLException {

        WebDriverManager.chromedriver().setup();
        WebDriver search=new ChromeDriver();

        URL googleUrl=new URL("http://www.google.com");

        search.navigate().to(googleUrl);

        search.findElement(By.name("q")).sendKeys("Amazon");
        search.findElement(By.name("q")).sendKeys(Keys.ENTER);    }
}

