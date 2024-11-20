import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xPath1 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net");
        driver.findElement(By.xpath("//a[@id = 'about-link']")).click();
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
