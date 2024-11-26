import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());

        WebElement w = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println(w.getText());

        WebElement b = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        System.out.println(b.getCssValue("color"));

        WebElement c = driver.findElement(By.cssSelector(".ui.green.header"));
        System.out.println(c.getAttribute("class"));

        WebElement d = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println(d.getText());

        driver.quit();




    }
}
