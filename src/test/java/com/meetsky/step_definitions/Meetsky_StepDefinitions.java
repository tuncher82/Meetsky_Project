package com.meetsky.step_definitions;

import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Meetsky_StepDefinitions {


    @Given("User goes to login page")
    public void user_goes_to_login_page() {
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login?clear=1");
    }

    @When("User on Meetsky Login page")
    public void user_on_meetsky_login_page() {
        System.out.println("User on meetsky login page");
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        String validUsername = "Employee52";
        WebElement usernameInput = Driver.getDriver().findElement(By.id("user"));
        usernameInput.sendKeys(validUsername);
    }

    @When("User enters valid password")
    public void user_enters_valid_password() {
        String validPassword = "Employee123";
        WebElement passwordInput = Driver.getDriver().findElement(By.id("password"));
        passwordInput.sendKeys(validPassword);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        Driver.getDriver().findElement(By.id("submit-form")).click();
    }

    @Then("User should see Files_Meetsky-QA title on the opened files page")
    public void user_should_see_files_meetsky_qa_title_on_the_opened_files_page() {
        String expectedTitle = "Files - Meetsky - QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @When("User enters invalid username")
    public void user_enters_invalid_username() {
        String invalidUsername = "Invalid Username";
        WebElement usernameInput = Driver.getDriver().findElement(By.id("user"));
        usernameInput.sendKeys(invalidUsername);

    }

    @Then("User should see {string} warning")
    public void user_should_see_warning(String string) {
        WebElement warningMessage = Driver.getDriver().findElement(By.xpath("//p[contains(text(),'Wrong username or password.')]"));

        Assert.assertTrue( warningMessage.isDisplayed());
    }


    @When("User enters invalid password")
    public void user_enters_invalid_password() {
        String invalidPassword = "Invalid Password";
        WebElement passwordInput = Driver.getDriver().findElement(By.id("password"));
        passwordInput.sendKeys(invalidPassword);

    }

}
