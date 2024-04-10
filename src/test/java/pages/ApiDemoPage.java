package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemoPage extends BasePage {
    By viewsLink = AppiumBy.accessibilityId("Views");
    By dragAndDropLink = AppiumBy.accessibilityId("Drag and Drop");
    By popupMenuLink = AppiumBy.accessibilityId("Popup Menu");
    By radioGroupLink = AppiumBy.accessibilityId("Radio Group");
    By swipeTopBottomBy = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView");
    By webView3By = AppiumBy.accessibilityId("WebView3");
    By ViewAnimationBy = AppiumBy.accessibilityId("Animation");
    By galleryLink = AppiumBy.accessibilityId("Gallery");
    By photosLink = AppiumBy.accessibilityId("1. Photos");
    By expandableListsBy = AppiumBy.accessibilityId("Expandable Lists");
    By customAdapterBy = AppiumBy.accessibilityId("1. Custom Adapter");
    By pushLinkBy = AppiumBy.accessibilityId("Push");
    By dateWidgetBy = AppiumBy.accessibilityId("Date Widgets");
    By dialogLinkBy = AppiumBy.accessibilityId("1. Dialog");
    By ratingBy = AppiumBy.accessibilityId("Rating Bar");


    public void clickOnViews() {
        clickElement(viewsLink);
    }

    public DragAndDropPage clickDragAndDrop() {
        clickElement(dragAndDropLink);
        return new DragAndDropPage();
    }

    public PopupMenuPage clickPopupMenuLink() {
        clickElement(popupMenuLink);
        return new PopupMenuPage();
    }

    public RadioGroupPage clickRadioGroup() {
        clickElement(radioGroupLink);
        return new RadioGroupPage();

    }

    public void scrollToView() {
        scrollUntilVisibilityOf("Popup Menu");
    }

    public void scrollToTextClock() {
        scrollUntilVisibilityOf("TextClock");
    }

    public void scrollToAnimation() {
        scrollUntilVisibilityOf("Animation");
    }

    public void scrollToRadioGroup() {
        scrollUntilVisibilityOf("Radio Group");

    }

    public void swipeBottom() {
        swipe(swipeTopBottomBy, "up");
    }

    public void verifyWebView3IsVisible(String expectedStringWebView3) {
        String ActualText = getElement(webView3By).getAttribute("text");
        Assert.assertEquals(ActualText, expectedStringWebView3);
        System.out.println("WebView3 link is visible");
    }

    public void swipeTop() {
        swipe(swipeTopBottomBy, "down");
    }

    public void verifyAniamtionIsVisible(String expectedStringAnimation) {
        String ActualText = getElement(ViewAnimationBy).getAttribute("text");
        Assert.assertEquals(ActualText, expectedStringAnimation);
        System.out.println("Animation link is visible");
    }

    public void tapOnGalleryLink() {
        clickElement(galleryLink);
    }

    public SwipePage tapOnPhoto() {
        clickElement(photosLink);
        return new SwipePage();
    }

    public void tapOnExpandableList() {
        clickElement(expandableListsBy);
    }

    public LongClickPage tapOnCustomAdapter() {
        longClick(customAdapterBy);
        return new LongClickPage();
    }

    public void clickOnAnimationLink() {
        clickElement(ViewAnimationBy);
    }

    public DropdownPage clickOnPushLink() {
        clickElement(pushLinkBy);
        return new DropdownPage();
    }

    public void tapOnDateWidgetLink() {
        clickElement(dateWidgetBy);
    }

    public DialogPage tapOnDialogLink() {
        clickElement(dialogLinkBy);
        return new DialogPage();
    }

    public ApiDemoPage clickOnRatingBar(){
        clickElement(ratingBy);
        return new ApiDemoPage();
    }
    public void scrollToRatingBarLink() {
        scrollUntilVisibilityOf("Rating Bar");

    }

    
}
