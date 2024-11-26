import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity17 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        WebElement w1 = driver.findElement(By.cssSelector("input[class $= '-username']"));
        w1.sendKeys("Abhinav");

        WebElement w2 = driver.findElement(By.cssSelector("input[class $= '-password']"));
        w2.sendKeys("22-10-2002");
        WebElement w3 = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        w3.sendKeys("22-10-2002");
        WebElement w4 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));
        w4.sendKeys("abhinavkonakandla@gmail.com");







        driver.quit();


    }
}
