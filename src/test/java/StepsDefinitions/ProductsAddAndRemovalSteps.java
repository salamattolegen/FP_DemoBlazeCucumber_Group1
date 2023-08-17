package StepsDefinitions;

import Pages.ProjectElements;
import Utilities.BaseDriverDemoBlaze;
import Utilities.ProjectMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;


public class ProductsAddAndRemovalSteps extends ProjectMethods {
    ProjectElements pe = new ProjectElements();

    @Given("Click Phones on the side menu")
    public void clickPhonesOnTheSideMenu() {
        //waitFor(3);
        pe.clickMethod(pe.phones);
    }


    @When("Select a phone")
    public void selectAPhone() {
        pe.clickMethod(pe.verifyPhone); // VerifyPhone has same locator as "Samsung galaxy s6"
    }


    @And("Add product to the cart")
    public void addProductToTheCart() {
        //waitFor(2);
        pe.clickMethod(pe.addToCart);

    }


    @And("Success message should appear")
    public void successMessageShouldAppear() {
        waitFor(2);
        Assert.assertTrue(BaseDriverDemoBlaze.getDriver().switchTo().alert().getText().contains("Product added."));
        BaseDriverDemoBlaze.getDriver().switchTo().alert().accept();
    }


    @Then("Click Home")
    public void clickHome() {
        pe.clickMethod(pe.home);

    }


    @Given("Click on Laptops on the side menu")
    public void clickOnLaptopsOnTheSideMenu() {

        pe.clickMethod(pe.laptop);
    }


    @When("Select a laptop")
    public void selectALaptop() {

        pe.clickMethod(pe.verifyLaptop);
    }


    @Given("Click on Monitors on the side menu")
    public void clickOnMonitorsOnTheSideMenu() {
        pe.clickMethod(pe.monitors);
    }


    @When("Select a monitor")
    public void selectAMonitor() {
        pe.clickMethod(pe.verifyMonitor);
    }


    @When("Go to the cart")
    public void goToTheCart() {
        pe.clickMethod(pe.goToCart);
    }


    @And("Remove monitor from the cart")
    public void removeMonitorFromTheCart() {
        pe.clickMethod(pe.deleteMonitor);
    }


    @Then("Assert product removal")
    public void assertProductRemoval() {

        waitFor(3);
        Assert.assertTrue(!pe.asusInCart.getText().contains("ASUS"));
    }


    @Given("Click next button on the right corner")
    public void clickNextButtonOnTheRightCorner() throws InterruptedException {
        pe.scrollTo();
        pe.clickMethod(pe.nextButton);
    }


    @When("Select a different monitor")
    public void selectADifferentMonitor() {
        pe.clickMethod(pe.appleMonitor24);
    }


    @Then("Assert that Total is correct")
    public void assertThatTotalIsCorrect() {
        pe.waitUntilVisible(pe.totalPrice);
        Assert.assertTrue(pe.totalPrice.getText().equals("1550"));
    }


    @When("Click Place order")
    public void clickPlaceOrder() {
        pe.clickMethod(pe.placeOrder);
    }


    @And("Fill the form and click purchase")
    public void fillTheFormAndClickPurchase() {
        pe.sendKeysMethod(pe.name, "salamat");
        pe.sendKeysMethod(pe.country, "USA");
        pe.sendKeysMethod(pe.city, "River Side");
        pe.sendKeysMethod(pe.creditCard, "12345678910");
        pe.sendKeysMethod(pe.month, "11");
        pe.sendKeysMethod(pe.year, "2023");
        pe.clickMethod(pe.purchase);
    }


    @And("Assert an ID is assigned. Assert Amount, Card number, Name and Date are correct")
    public void assertAnIDIsAssignedAssertAmountCardNumberNameAndDateAreCorrect() {
        Assert.assertTrue(pe.totalPrice.getText().contains("1550"));
        Assert.assertTrue(pe.cardNumber.getText().contains("12345678910"));
        Assert.assertTrue(pe.name2.getText().contains("salamat"));
        Assert.assertTrue(pe.date.getText().contains("2023"));
    }


    @Then("Click OK.")
    public void clickOK() {
        pe.clickMethod(pe.okkay);
    }


}
