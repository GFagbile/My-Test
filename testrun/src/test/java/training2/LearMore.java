package training2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearMore {
    public static void main(String[] args) throws InterruptedException {


        WebDriver avaranth = new ChromeDriver();

        avaranth.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        Thread.sleep(5000);
        avaranth.findElement(By.xpath("//input[@id='username']")).sendKeys("Moses");
        avaranth.findElement(By.xpath("//input[@id= 'password']")).sendKeys("mikky");

        avaranth.findElement(By.xpath("//button[@onclick=\"login()\"]")).click();
        Thread.sleep(5000);
        avaranth.close();


    }
}
