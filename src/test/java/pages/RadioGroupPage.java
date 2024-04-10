package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class RadioGroupPage extends BasePage {
    By snackRadioButton = AppiumBy.id("io.appium.android.apis:id/snack");
    By clearButton = AppiumBy.accessibilityId("Clear");

    public void selectSnack() {
        clickElement(snackRadioButton);
    }

    public void ClickClearButton() {
        clickElement(clearButton);
    }

}
