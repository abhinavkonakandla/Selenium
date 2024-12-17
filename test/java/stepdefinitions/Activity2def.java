package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import java.time.Duration;

public class Activity2def {
    WebDriver driver;
    WebDriverWait wait;


    @Given("User is on the Login page")
    public void userIsOnTheLoginPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println(driver.getTitle());
    }
//    @Given("User is on Login page")
//    public void userIsOnLoginPage(){
//        driver = new FirefoxDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        //Open the browser
//        driver.get("https://v1.training-support.net/selenium/login-form");
//        System.out.println(driver.getTitle());
//
//    }
//    @When("User enters {username} and {password}")
//    public void enteringUsernameAndPassword(String admin, String password){
//        WebElement w1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//        WebElement w2 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
////        w1.sendKeys("admin");
////        w2.sendKeys("password");
//        w1.sendKeys(admin);
//        w2.sendKeys(password);
//    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String admin, String password) {
        WebElement w1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement w2 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        w1.sendKeys(admin);
        w2.sendKeys(password);
    }


    @Then("Read the page title and confirmation message")
    public void readAndConfirm(){
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
        WebElement w3 = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
//        Assert.assertEquals(w3.getText(),"Welcome Back, admin");
        System.out.println(w3.getText());
    }
    @And("Close the Browser")
    public void closingTheBrowser(){
        driver.close();
    }



}
