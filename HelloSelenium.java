import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HelloSelenium {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net");
        String s = driver.getTitle();
        System.out.println(s);

        WebElement w =  driver.findElement(By.id("about-link"));
        w.click();

        String st = driver.getTitle();
        System.out.println(st);





        // Perform testing and assertions

        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}
