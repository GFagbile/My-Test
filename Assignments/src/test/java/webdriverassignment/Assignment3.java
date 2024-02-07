package webdriverassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {

       // 1. TC-1 launch Firefox browser
        WebDriver run = new FirefoxDriver();

        //2. TC-2 go to test URL https://www.google.com
        run.get("https://www.google.com");

        //3. TC-3 specify wait time for 5 sec
        Thread.sleep(5000);

        //4. TC-4 get the title of page into console
        String data = run.getTitle();

        //5. TC-5 close the browser
        run.close();


    }
}
