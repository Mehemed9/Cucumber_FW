package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class signup_step extends config {


    @And("student click on Create New Account button")
    public void studentClickOnCreateNewAccountButton()  {
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div/div/a")).click();
    }

    @And("student enter their First Name{string}")
    public void studentEnterTheirFirstName(String FirstName) {
        driver.findElement(By.name("firstName")).sendKeys(FirstName);
    }

    @And("student enter their Last Name {string}")
    public void studentEnterTheirLastName(String LastName) {
        driver.findElement(By.name("lastName")).sendKeys(LastName);
    }

    @And("student enter their Email Address {string}")
    public void studentEnterTheirEmailAddress(String Email) {
        driver.findElement(By.name("email")).sendKeys(Email);
    }

    @And("student enter their password {string}")
    public void studentEnterTheirPassword(String Password) {
        driver.findElement(By.name("password")).sendKeys(Password);
    }

    @And("student confirm their password {string}")
    public void studentConfirmTheirPassword(String confirmPassword) {
        driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
    }

    @And("student enter their date of birth Month {string}")
    public void studentEnterTheirDateOfBirthMonth(String Month) {
        Select m = new Select(driver.findElement(By.name("month")));
        m.selectByVisibleText(Month);

    }

    @And("student enter their date of birth Day {string}")
    public void studentEnterTheirDateOfBirthDay(String Day) {
        Select m = new Select(driver.findElement(By.name("day")));
        m.selectByVisibleText(Day);

    }

    @And("student enter their date of birth Year {string}")
    public void studentEnterTheirDateOfBirthYear(String year) {
        Select m = new Select(driver.findElement(By.name("year")));
        m.selectByVisibleText(year);
    }


    @And("student choose their gender")
    public void studentChooseTheirGender() {
        driver.findElement(By.xpath("//*[@id=\"male\"]")).click();


    }



    @And("student agree terms and conditions")
    public void studentAgreeTermsAndConditions() {
        driver.findElement(By.xpath("//*[@id=\"defaultCheck1\"]")).click();
    }

    @When("student click on create my account button")
    public void studentClickOnCreateMyAccountButton() {
        driver.findElement(By.xpath("//*[@id=\"signup-form\"]/button")).click();
    }

    @Then("student should successfully create their account")
    public void studentShouldSuccessfullyCreateTheirAccount() throws InterruptedException {
        String actual = "Success!";
        Thread.sleep(1000);
        String expected= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
        Assert.assertEquals(actual,expected);
    }
}