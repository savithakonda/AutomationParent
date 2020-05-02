package selenium.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {


    public static WebDriver launch(String webUrl) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.get(webUrl);
        return chromeBrowser;
    }


    public static void captureBrowserInfo(WebDriver browser) {
        String currentUrl = browser.getCurrentUrl();
        System.out.println("Current URL of the browser is : " + currentUrl);

        String title = browser.getTitle();
        System.out.println("Current title of the browser is : " + title);
    }

}
