package facebookpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookWorks {

    WebDriver driver;

    @Given("User navigates to facebook application via chromebrowser")
        public void navigatesToUrl(){
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");

    }


    @When("user inputs the username {string} and password {string}")
    public void inputData(String username, String gneesky) {
        driver.findElement(By.id("email")).sendKeys("username");
        driver.findElement(By.name("pass")).sendKeys("gneesky");

        
    }

    @And("user clicks on login button")
    public void loginButton() {
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }

    @Then("user validates the error message")
    public void errorMessage() {
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
        System.out.println(actualErrorMessage);
        String expectedResult = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

        if (actualErrorMessage.equals(expectedResult)){
            System.out.println("equal");

        }
        else {
            System.out.println("Not equal");
        }


    }
}

//The email address or mobile number you entered isn't connected to an account. Find your account and log in.