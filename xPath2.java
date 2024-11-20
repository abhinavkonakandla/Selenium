import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xPath2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");

        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("password");
        driver.findElement(By.xpath("//div/button[@class= 'ui button']")).click();

        WebElement w1 = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        System.out.println(w1.getText());

        driver.quit();
    }
}
