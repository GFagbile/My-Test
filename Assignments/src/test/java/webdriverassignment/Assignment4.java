package webdriverassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {


        //1. TC-1 launch Internet Explorer browser(EdgeDriver)
        WebDriver webDriver = new EdgeDriver();

       // 2. TC-2 go to test URL https://www.google.com
        webDriver.get("https://www.google.com");

       // 3. TC-3 specify wait time for 5 sec
        Thread.sleep(5000);

        //4. TC-4 get the title of page into console
        String title = webDriver.getTitle();
        System.out.println(title);

        //5. TC-5 close the browser
        webDriver.close();

    }
}
