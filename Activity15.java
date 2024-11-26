import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        Actions builder = new Actions(driver);

        WebElement w2 = driver.findElement(By.tagName("textarea"));
        w2.sendKeys("cheese");


        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"hdtb-tls\"]")));
        WebElement w3 = driver.findElement(By.xpath("//div[@id=\"hdtb-tls\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"hdtb-tls\"]")));
        w3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"result-stats\"]")));
        WebElement w4 = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        System.out.println(w4.getText());


        driver.quit();












    }
}
