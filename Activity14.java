import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();


        driver.get("https://v1.training-support.net/selenium/tables");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        List<WebElement> l1 = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr"));
        System.out.println(l1.size());

        List<WebElement> l2 = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th"));
        System.out.println(l2.size());

        List<WebElement> l3 = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));
        for(WebElement e1:l3){
            System.out.println(e1.getText());
        }

        WebElement l4 = driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[1]"));
        l4.click();
        System.out.println(l4.isSelected());

        List<WebElement> l5 = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));
        for(WebElement e1:l5){
            System.out.println(e1.getText());
        }

        List<WebElement> l6 = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tfoot/tr/th"));
        for(WebElement e2:l6){
            System.out.println(e2.getText());
        }

        driver.quit();

    }
}
