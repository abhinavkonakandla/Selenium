import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity9 {
    private static final Logger log = LoggerFactory.getLogger(Activity9.class);
    WebDriver driver = new FirefoxDriver();

    @BeforeTest
    public void BeforeTest() {
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("Before method fired for activity9....");
    }

    @Test
    public void simpleAlertTestCase() {
        WebElement w1 = driver.findElement(By.xpath("//*[@id=\"simple\"]"));
        w1.click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        Assert.assertEquals(alert1.getText(), "This is a JavaScript Alert!");
        Reporter.log(alert1.getText());

    }

    @Test
    public void confirmAlertTestCase() {
        WebElement w2 = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        w2.click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        Assert.assertEquals(alert2.getText(), "This is a JavaScript Confirmation!");
        Reporter.log(alert2.getText());
        alert2.accept();
    }

    @Test
    public void promptAlertTestCase() {
        WebElement w3 = driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
        w3.click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("My name is abhinav");
        System.out.println(alert3.getText());
        Reporter.log(alert3.getText());
        Assert.assertEquals(alert3.getText(), "This is a JavaScript Prompt!");
        alert3.dismiss();
    }

    @BeforeMethod
    public void BeforeMethod() {
        Reporter.log("Setting up the test environment", true);
        driver.switchTo().defaultContent();
    }

    @AfterTest
    public void AfterMethod() {
        driver.quit();
    }
}
