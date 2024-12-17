import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test1 {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        @BeforeClass
        public void beforeClass(){
            System.out.println("Before class fired for Test1...");
            System.out.println("Abhinav");
        }


        // Open the browser
        @Test
        public void first(){
            driver.get("https://v1.training-support.net");
            System.out.println(driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Training Support");

        }
        @Test
        public void second(){
            WebElement w1 = driver.findElement(By.xpath("//*[@id=\"about-link\"]"));
            w1.click();
            Assert.assertEquals(driver.getTitle(),"About Training Support");
        }


        @AfterClass
        public void afterClass(){
            System.out.println("After firing Afterclass Test1....");
            driver.quit();
        }


    }


