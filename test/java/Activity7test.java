import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7test {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass(alwaysRun = true)
    public void BeforeClass(){
        System.out.println("before class fired....");
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {
                { "admin", "password" },
                { "testuser_2", "Test@456" }
        };
    }

    @BeforeMethod
    public void BeforeMethod(){
        driver.navigate().refresh();
    }

    @Test(dataProvider = "Authentication")
    @Parameters({"username","password"})
    public void test1(String username,String password){
        WebElement w1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement w2 = driver.findElement(By.xpath("//*[@id=\"password\"]"));

        w1.sendKeys(username);
        w2.sendKeys(password);
        WebElement w3 = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        w3.click();

        WebElement finalMsg = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        Assert.assertEquals(finalMsg.getText(),"Welcome Back, admin");
    }



    @AfterClass
    public void AfterClass(){
        driver.quit();
    }
}
