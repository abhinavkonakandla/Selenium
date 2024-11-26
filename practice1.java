import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class practice1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());


        action.click().pause(1000).build().perform();
        String str = driver.findElement(By.className("active")).getText();
        System.out.println(str);

        action.doubleClick().pause(1000).build().perform();
        str = driver.findElement(By.className("active")).getText();
        System.out.println(str);


        action.contextClick().pause(1000).build().perform();
        str = driver.findElement(By.cssSelector("active")).getText();
        System.out.println(str);

        driver.close();

    }
}
