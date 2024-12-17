import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5test5 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass(alwaysRun = true)
    public void BeforeClass(){
        System.out.println("before class triggred");
        driver.get("https://v1.training-support.net/selenium/target-practice");

    }

    @Test(groups = {"Header Tests"})
    public void firstTest(){
        WebElement w1 = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        Assert.assertEquals(driver.getTitle(),"Target Practice");
    }
    @Test(groups = {"Header Tests"})
    public void secondTest(){
        WebElement w2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        Assert.assertEquals(w2.getCssValue("color"),"rgb(33, 186, 69)");
    }
    @Test(groups = {"Button Tests"})
    public void test3(){
        WebElement w3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/button[4]"));
        Assert.assertEquals(w3.getText(),"Olive");
    }
    @Test(groups = {"Button Tests"})
    public void test4(){
        WebElement w4 = driver.findElement(By.cssSelector(".ui.brown.button"));
        Assert.assertEquals(w4.getCssValue("color"),"rgb(255, 255, 255)");
    }

    @AfterClass(alwaysRun = true)
    public void AfterClass(){
        driver.quit();
    }
}
