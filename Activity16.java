import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        WebElement w1 = driver.findElement(By.cssSelector("input[class^='username']"));
        WebElement w2 = driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
        w1.sendKeys("admin");
        w2.sendKeys("password");

        driver.findElement(By.xpath("//button[@class = '.ui.button']")).click();

        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();


    }
}
