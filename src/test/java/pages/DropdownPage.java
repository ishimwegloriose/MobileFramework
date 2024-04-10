package pages;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DropdownPage extends BasePage {
    By animationDropDownBy = AppiumBy.id("io.appium.android.apis:id/spinner");
    By pushLefLinktBy = AppiumBy.xpath("//*[@text='Push left']");
    By actualSelectedItem = AppiumBy.id("android:id/text1");

    public void tapOnDropDownIcon() {

        clickElement(animationDropDownBy);
    }

    public void isDropdownIconClicked() {
        String dropdownIcon = getElement(animationDropDownBy).getAttribute("clickable");
        assertEquals(dropdownIcon, "true");

    }

    public void tapOnPushLeftLink() {

        clickElement(pushLefLinktBy);
    }

    public void verifyIfPushLeftIsSelected(String expectedSelectedItem) {

        String ActualText = getElement(actualSelectedItem).getAttribute("text");
        Assert.assertEquals(ActualText, expectedSelectedItem);
        System.out.println("*******Push left item is clicked*********");
    }

}
