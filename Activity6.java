import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import javax.swing.*;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());

        Actions builder = new Actions(driver);
        Action ac = builder.keyDown("A").keyUp("A").build();
        ac.perform();

        Action ac2 = builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        ac2.perform();

        driver.quit();


    }
}
/*
Input Events
Mouse and Keyboard events.
        1
        2
        3
        4
No Key Pressed
*/