import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass
    public void BeforeClass(){
        System.out.println("before class triggred");
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void first(){
        WebElement w1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement w2 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        w1.sendKeys("admin");
        w2.sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
        WebElement w3 = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        Assert.assertEquals(w3.getText(),"Welcome Back, admin");
    }



    @AfterClass
    public void AfterClass(){
        driver.quit();
    }
}
