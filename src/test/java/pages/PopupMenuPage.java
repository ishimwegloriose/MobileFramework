package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PopupMenuPage extends BasePage {
    By makePopup = AppiumBy.accessibilityId("Make a Popup!");
    // By searchId = AppiumBy.xpath("//*[@text='Search']");
    By searchId = AppiumBy.xpath("//*[@text='Search']");
    // By searchItemSelected = AppiumBy.xpath("//*[@text='Clicked popup menu item
    // Search']");
    By searchItemSelected = AppiumBy.xpath("/hierarchy/android.widget.Toast[1]");

    public void clickMakePopup() {
        clickElement(makePopup);
        System.out.println("make a popup is clicked");

    }

    public void viewSearchItemOnMenu(String expectedMenuItem) {
        String actualMenuItem = getElement(searchId).getAttribute("text");
        Assert.assertEquals(actualMenuItem, expectedMenuItem);
        System.out.println("Search is on the menu");
        System.out.println("ready to select search item");

    }

    public void selectSearchItem() {
        clickElement(searchId);
        System.out.println("Search button is clicked");

    }

    public void VerifyIfSearchClicked(String expectedSearchText) {
        String ActualText = getElement(searchItemSelected).getAttribute("text");
        System.out.println("****************");
        Assert.assertEquals(ActualText, expectedSearchText);
        System.out.println("*******Search is clicked*********");

    }

    By snackRadioButton = AppiumBy.id("io.appium.android.apis:id/snack");
    By clearButton = AppiumBy.accessibilityId("Clear");

    public void selectSnack() {
        clickElement(snackRadioButton);
    }

    public void ClickClearButton() {
        clickElement(clearButton);
    }

}
