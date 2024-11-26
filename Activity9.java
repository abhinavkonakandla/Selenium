import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement w1 = driver.findElement(By.cssSelector(".ui.violet.button"));
        w1.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        WebElement w2  = driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h1"));
        WebElement str = driver.findElement(By.tagName("h1"));
        System.out.println(str.getText());

        WebElement w3 = driver.findElement(By.tagName("h3"));
        System.out.println(w3.getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        WebElement st = driver.findElement(By.tagName("h3"));
        System.out.println(st.getText());

        driver.quit();
    }
}
