package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to the login page")
    public void i_navigate_to_login_page() {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//drivers//chrome//chromedriver.exe");
        driver = new ChromeDriver();  // Make sure WebDriver is setup
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");  // Replace with real URL
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_credentials(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Submit")).click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_dashboard() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed());  // Example assertion
        driver.quit();
    }
}