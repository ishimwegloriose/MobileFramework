package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class SwipePage extends BasePage {
    By secondImageBy = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[2]");
    By thirdImageBy = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[3]");

    public void swipeSecondImageLeft() {
        swipe(secondImageBy, "left");
    }

    public void isSecondImageSwiped() {
        String secondImageFocusable = getElement(secondImageBy).getAttribute("focusable");
        String thirdImageFocusable = getElement(thirdImageBy).getAttribute("focusable");
        assertEquals(secondImageFocusable, "false");
        assertEquals(thirdImageFocusable, "true");
    }

    public void swipeThirdImageRight() {
        swipe(secondImageBy, "right");
    }

    public void isThirdImageSwiped() {
        String secondImageFocusable = getElement(secondImageBy).getAttribute("focusable");
        String thirdImageFocusable = getElement(thirdImageBy).getAttribute("focusable");
        assertEquals(secondImageFocusable, "true");
        assertEquals(thirdImageFocusable, "false");
    }

}
