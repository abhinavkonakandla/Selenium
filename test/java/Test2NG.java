import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2NG {
WebDriver driver = new FirefoxDriver();
    @BeforeClass
    public void BeforeClass(){
        System.out.println("before class triggred for Test2NG");
        driver.get("https://v1.training-support.net/selenium/target-practice");

    }
    @Test
    public void firstTest(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Target Practice");
    }
    @Test
    public void testtwo(){
        WebElement blackButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[3]"));
        Assert.assertEquals(blackButton.getText(),"White");

    }
    @Test(enabled = false)
    public void ThirdTest(){

    }
    @Test
    public void FourthTest(){
        throw new SkipException("This message is to be skipped");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("Aftre class fired for the Test2NG... ");
        driver.close();
    }



}

