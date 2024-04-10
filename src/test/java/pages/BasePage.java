package pages;

import java.time.Duration;

// import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverManager;

public class BasePage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickElement(By locator) {
        getElement(locator).click();
        // driver.findElement(locator).click();
    }

    public void dragAndDrop(By locator, int endX, int endY) {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) driver.findElement(locator)).getId(),
                "endX", endX,
                "endY", endY));

    }

    public WebElement getElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        // return driver.findElement(locator);
        return element;

    }

    // public String getElementAttribute(By locator, String attributeName){

    // }

    public void scrollUntilVisibilityOf(String elementText) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
                        "new UiSelector().textContains(\"" + elementText + "\"))"));
    }

    public void swipe(By locator, String direction) {
        WebElement element = getElement(locator);
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", direction.toLowerCase(),
                "percent", 0.3));
                System.out.println("******************************************** SELECTED HOUR *****************************************");
    }

    public void longClick(By locator) {
        WebElement element = getElement(locator);
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(), "duration", 1000));
    }

}
