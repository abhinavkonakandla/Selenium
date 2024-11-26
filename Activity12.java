import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        WebElement w1 = driver.findElement(By.id("input-text"));
        System.out.println(w1.isEnabled());

        WebElement w2 = driver.findElement(By.id("toggleInput"));
        w2.click();
        System.out.println(w1.isEnabled());

        driver.quit();


    }
}
