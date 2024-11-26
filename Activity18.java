import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        WebElement dropDown = driver.findElement(By.tagName("select"));
        Select select = new Select(dropDown);
        List<WebElement> elements = select.getOptions();

        select.selectByVisibleText("Option 2");
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("4");
        System.out.println(select.getFirstSelectedOption().getText());

        for (WebElement e:select.getOptions()){
            System.out.println(e.getText());
        }


        driver.quit();

    }
}
