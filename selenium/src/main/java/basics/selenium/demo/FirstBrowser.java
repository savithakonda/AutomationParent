package basics.selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowser {
    public static void main(String[] args) {

        // Launch a browser
        // navigate to url
        // close the browser

        // adding system property with key and value
        // System.setProperty("webdriver.chrome.driver", "selenium/src/main/resources/chromedriver.exe");

        // configuration using webdriver manager
        WebDriverManager.chromedriver().setup();

        // launch browser
        WebDriver browser = new ChromeDriver();

        // navigate to an URL
        browser.get("http://www.google.com");
        captureBrowserInfo(browser);

        // navigate to another url on the same browser
        //browser.get("http://www.github.com");
        browser.navigate().to("http://www.github.com");
        captureBrowserInfo(browser);

        // navigate to back using navigate() on the browser
        browser.navigate().back();
        captureBrowserInfo(browser);

        // navigate to forward
        browser.navigate().forward();
        captureBrowserInfo(browser);

        // navigate to refresh or reload
        browser.navigate().refresh();
        captureBrowserInfo(browser);
        browser.close();

    }

    private static void captureBrowserInfo(WebDriver browser) {
        // extract the url from the browser after launching the website
        String currentUrl = browser.getCurrentUrl();
        System.out.println("Current URL of the browser is : " + currentUrl);

        // extract the title from the browser after launching the website
        String title = browser.getTitle();
        System.out.println("Current title of the browser is : " + title);
    }
}
