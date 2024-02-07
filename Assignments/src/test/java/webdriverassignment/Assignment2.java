package webdriverassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {

        // 1. TC-1 launch Chrome browser
        WebDriver test = new ChromeDriver();

        //2. TC-2 go to test URL https://www.google.com
        test.get("https://www.google.com");

        //3. TC-3 specify wait time for 5 sec
        Thread.sleep(5000);

        //4. TC-4 get the title of page into console
        String title = test.getTitle();

        //5. TC-5 close the browser
        test.close();
    }
}
