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

        Assert.assertTrue(warningMessage.isDisplayed());
    }


    @When("User enters invalid password")
    public void user_enters_invalid_password() {
        String invalidPassword = "Invalid Password";
        WebElement passwordInput = Driver.getDriver().findElement(By.id("password"));
        passwordInput.sendKeys(invalidPassword);

    }


    @Then("User should see {string} message")
    public void user_should_see_message(String string) {
        WebElement usernameBox = Driver.getDriver().findElement(By.id("user"));
        String validationMessage =usernameBox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage,"Please fill in this field.");

    }

    @Then("User should see {string} message in password box")
    public void user_should_see_message_in_password_box(String string) {

        WebElement passwordBox = Driver.getDriver().findElement(By.id("password"));
        String validationMessage =passwordBox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage,"Please fill in this field.");

    }

    @Then("User should see the password in a form of dots")
    public void user_should_see_the_password_in_a_form_of_dots() {

        WebElement passBox = Driver.getDriver().findElement(By.id("password"));
        String passMessage =passBox.getAttribute("type");
        Assert.assertEquals(passMessage,"password");

    }

    @When("User clicks the eye icon to see the password")
    public void user_clicks_the_eye_icon_to_see_the_password() {
       WebElement eyeIcon = Driver.getDriver().findElement(By.xpath("//body/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/fieldset[1]/p[2]/a[1]/img[1]"));
       eyeIcon.click();

    }

    @Then("User should see the password explicitly")
    public void user_should_see_the_password_explicitly() {

        WebElement passBox = Driver.getDriver().findElement(By.id("password"));
        String passMessage =passBox.getAttribute("type");
        Assert.assertEquals(passMessage,"text");

    }

    @When("User can see the Forgot password? link on the login page")
    public void user_can_see_the_forgot_password_link_on_the_login_page() {
       WebElement forgotLink = Driver.getDriver().findElement(By.id("lost-password"));
       Assert.assertTrue(forgotLink.isDisplayed());
    }

    @When("User clicks the Forgot Password? link")
    public void user_clicks_the_forgot_password_link() {
        WebElement forgotLink = Driver.getDriver().findElement(By.id("lost-password"));
        forgotLink.click();
    }

    @Then("User can see the {string} button on the next page after clicking on forget password link")
    public void user_can_see_the_button_on_the_next_page_after_clicking_on_forget_password_link(String string) {
     WebElement resetPassword = Driver.getDriver().findElement(By.id("reset-password-submit"));
     boolean r = resetPassword.isDisplayed();
        System.out.println("r = " + r);
    }


    @Then("User can see valid placeholders on Username and Password fields as expected")
    public void user_can_see_valid_placeholders_on_username_and_password_fields_as_expected() {

        WebElement passBox = Driver.getDriver().findElement(By.id("password"));
        String passwordPlaceHolder =passBox.getAttribute("placeholder");
        Assert.assertEquals(passwordPlaceHolder,"Password");

        WebElement usernameBox = Driver.getDriver().findElement(By.id("user"));
        String userPlaceHolder =usernameBox.getAttribute("placeholder");
        Assert.assertEquals(userPlaceHolder,"Username or email");



    }







}
