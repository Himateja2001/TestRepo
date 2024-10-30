package StepDefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    public static WebDriver driver=null;

    @BeforeAll
    public static void before_all(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/v1/");
    }
    @Test
    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    @Then("user should be navigated to Home page successfully")
    public void userShouldBeNavigatedToHomePageSuccessfully() {
        String title= driver.getTitle();
        Assert.assertEquals(title,"Swag Labs");
    }
}
