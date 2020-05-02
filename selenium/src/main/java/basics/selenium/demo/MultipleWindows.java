package basics.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.factory.BrowserFactory;

import java.util.Set;

import static selenium.factory.BrowserFactory.captureBrowserInfo;
import static selenium.factory.BrowserFactory.launch;

public class MultipleWindows {

    public static void main(String[] args) {
        // Program to differentiate close and quit
        WebDriver browser = launch("http://www.naukri.com");

        captureBrowserInfo(browser);

        // capture the browser and popup information
        // getWindowHandles will give all the ids of the windows available on this instance
        Set<String> allWindows = browser.getWindowHandles();

        // Foreach loop is similar to for loop - but without using size/
        for (String i : allWindows) {
            System.out.println("The window id is : " + i);
            captureBrowserInfo(browser);

            browser.switchTo().window(i);

            if ("Fujitsu".equalsIgnoreCase(browser.getTitle())) {
                // don't switch any more. I have the required window in focus now
                break;
            }

        }

        browser.findElement(By.tagName("img")).click();


        Set<String> newAllWindows = browser.getWindowHandles();

        newAllWindows.removeAll(allWindows);

        for (String id: newAllWindows         ) {
            browser.switchTo().window(id);
        }

        captureBrowserInfo(browser);


        browser.quit();


    }

}
