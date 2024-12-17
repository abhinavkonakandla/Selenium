package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class googlesearchpage {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Google Home Page$")
    public void userIsOnGooglePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Open the browser
        driver.get("https://www.google.com");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void userTypesInCheeseAndHitsENTER() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }

    @Then("^Show how many search results were shown$")
    public void showHowManySearchResultsWereShown() throws Throwable {
        Actions builder = new Actions(driver);
        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"hdtb-tls\"]")));
        WebElement w3 = driver.findElement(By.xpath("//div[@id=\"hdtb-tls\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"hdtb-tls\"]")));
        w3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"result-stats\"]")));
        WebElement w4 = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        System.out.println(w4.getText());
    }

    @And("^Close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
