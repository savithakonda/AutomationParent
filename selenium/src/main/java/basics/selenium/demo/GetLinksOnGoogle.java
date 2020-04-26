package basics.selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetLinksOnGoogle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        browser.get("http://www.google.com");

        List<WebElement> links = browser.findElements(By.tagName("a"));

        // Size of links on the home page
        System.out.println("Total links available : " + links.size());

        for (int i = 0; i < links.size(); i++) {
            System.out.println((i+1) + " - " + links.get(i).getText() + " --- " + links.get(i).getAttribute("href") );
        }
    browser.close();
    }

}


