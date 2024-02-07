package webdriverassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
    public static void main(String[] args) {


        // 1. Write a Test Script to open Test URL in Chrome Browser.
        WebDriver test = new ChromeDriver();

        // 2. Write a Test Script to open Test URL in Firefox Browser.
        WebDriver testt = new FirefoxDriver();

        //3. Write a Test Script to open Test URL in Internet Explorer Browser(EdgeDriver)
        WebDriver tesst = new EdgeDriver();

    }
}
