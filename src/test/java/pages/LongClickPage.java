package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class LongClickPage extends BasePage {
    By catNamesBy = AppiumBy.xpath("//*[@text='Cat Names']");
    By sampleMenuTitle = AppiumBy.xpath("//*[@text='Sample menu']");
    By sampleActionLinkBy = AppiumBy.xpath("//*[@text='Sample action']");
    By verifyCatNamesSelectedBy = AppiumBy.xpath("/hierarchy/android.widget.Toast[1]");

    public void longClickOnCatNames() {
        longClick(catNamesBy);

    }

    public void verifySampleMenuTitleIsVisible(String expectedTitle) {
        String actualMessage = getElement(sampleMenuTitle).getAttribute("text");
        Assert.assertEquals(expectedTitle, actualMessage);
        System.out.println("the visible title is correct!");
    }

    public void tapOnSampleActionLink() {
        clickElement(sampleActionLinkBy);
    }

    public void verifySampleActionLinkIsClicked(String expectedToastedMessage) {
        String actualMessage = getElement(verifyCatNamesSelectedBy).getAttribute("text");
        Assert.assertEquals(expectedToastedMessage, actualMessage);
        System.out.println("Toasted message is correct!");
    }

}
