import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://login.salesforce.com/?locale=eu");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);

        webDriver.findElement(By.name("username")).sendKeys("Gbenga");

        webDriver.findElement(By.id("password")).sendKeys("nesky8");
        webDriver.findElement(By.xpath("//input[@id='Login']")).click();


        String actualText = webDriver.findElement(By.id("error")).getText();

        //System.out.println(actualText);

        String expectedText ="check your username and password. If you still can't log in, contact your Salesforce administrator.";

        if (actualText.equals(expectedText)){
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }





        //Thread.sleep(5000);





//        webDriver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("Gbenga");
//        webDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("nesky77");
//        webDriver.findElement(By.xpath("//input[@type='submit']")).click();
//        webDriver.findElements(By.id("error")).g

        webDriver.close();

    }
}
