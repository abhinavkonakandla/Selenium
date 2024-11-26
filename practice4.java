import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class practice4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.navigate().refresh();

        Actions actions = new Actions(driver);

        WebElement w1 = driver.findElement(By.className(".ui.red.button"));
        w1.click();
        System.out.println(w1.getText());

        driver.navigate().refresh();

        WebElement w2 = driver.findElement(By.className(".ui.orange.button"));

        actions.click().build().perform();

        driver.navigate().refresh();

        driver.quit();


    }
}
