package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DragAndDropPage extends BasePage {
   By textlessCircle = AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
   By dragAndDropBy = AppiumBy.id("io.appium.android.apis:id/drag_result_text");

   public void dragTextLessCircle() {
      dragAndDrop(textlessCircle, 814, 1291);

   }

   public void dragAndDropCheckResult(String expectedMessage) {

      String actualMessage = getElement(dragAndDropBy).getAttribute("text");
      Assert.assertEquals(expectedMessage, actualMessage);
      System.out.println("the returned message is correct!!");
   }
}
