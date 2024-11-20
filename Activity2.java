import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/login-form");
        String s = driver.getTitle();
        System.out.println(s);

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");

        driver.findElement(By.xpath("//button[text()= 'Log in']")).click();

        WebElement w= driver.findElement(By.id("action-conformation"));
        System.out.println(w);
        driver.quit();
    }
}
