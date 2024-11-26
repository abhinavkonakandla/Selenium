import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/tables");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        List<WebElement> l1 = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr"));
        System.out.println(l1.size());

        List<WebElement> l2 = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td"));
        System.out.println(l2.size());

        List<WebElement> l3 = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        for(WebElement e:l3){
            System.out.println(e.getText());
        }

        List<WebElement> l4 = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
        for(WebElement e1:l4){
            System.out.println(e1.getText());
        }

        driver.quit();

    }
}
