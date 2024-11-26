import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        WebElement dropDown = driver.findElement(By.id("multi-select"));
        Select select = new Select(dropDown);

        select.selectByVisibleText("Javascript");
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(3); // Index starts from 0
        select.selectByIndex(4);
        select.selectByIndex(5);
        List<WebElement> li = select.getAllSelectedOptions();
        for (WebElement e: select.getOptions()){
            System.out.println(e.getText());
        }

        // Select the "NodeJS" option using value
        select.selectByValue("node");
        System.out.println(select.getFirstSelectedOption().getText());

        // Deselect the 5th option using index
        select.deselectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());

        driver.quit();
    }
}
