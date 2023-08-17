package Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
public class ProjectMethods {
    public WebDriverWait wait = new WebDriverWait(BaseDriverDemoBlaze.getDriver(), Duration.ofSeconds(10));


    public void clickMethod(WebElement element) {
        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }


    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriverDemoBlaze.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    public void sendKeysMethod(WebElement element, String text) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }


    public void assertLogin(WebElement element, String text) {
        waitUntilClickable(element);
        Assert.assertTrue(element.getText().contains(text));
    }


    public void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void scrollTo() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriverDemoBlaze.getDriver();
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, 3000)");
    }

}
