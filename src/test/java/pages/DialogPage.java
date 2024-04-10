package pages;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DialogPage extends BasePage {
    By changeDateButtonBy = AppiumBy.accessibilityId("change the date");
    By dateBy = AppiumBy.accessibilityId("20 March 2024");
    By okButton = AppiumBy.xpath("//*[@text='OK']");
    By selecteddateTimeBy = AppiumBy.id("io.appium.android.apis:id/dateDisplay");

    By changeTimeButtonBy = AppiumBy.accessibilityId("change the time");
    By PMBy = AppiumBy.id("android:id/pm_label");
    By timeBy = AppiumBy.accessibilityId("6");
    By minuteBy = AppiumBy.accessibilityId("25");

    By changeTimeSpinnerButtonBy = AppiumBy.accessibilityId("change the time (spinner)");
    By timeSpinnerBy = AppiumBy.xpath("//android.widget.NumberPicker[@index='0']");
    By hoursSpinnerBy = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id='android:id/timePickerLayout']/android.widget.LinearLayout/android.widget.NumberPicker[2]");
    By swipeTimeBy = AppiumBy.xpath("//android.widget.EditText[@resource-id='android:id/numberpicker_input'and @text='1'");
    By swipeMinuteBy = AppiumBy.xpath("//android.widget.EditText[@resource-id='android:id/numberpicker_input' and @text='02'");
    

    public void tapChangeDateButton() {
        clickElement(changeDateButtonBy);
    }

    public void select20MarchFromCalendar() {
        clickElement(dateBy);
    }

    public void tapOnOkButton() {
        clickElement(okButton);
    }

    public void isDateSelected(String expectedDate) {
        String selectedDateTime = getElement(selecteddateTimeBy).getAttribute("text");
        String selectedDate = selectedDateTime.substring(0, 9);
        Assert.assertEquals(expectedDate, selectedDate);
    }
// ********************
    public void tapChangeTimeButton() {
        clickElement(changeTimeButtonBy);
    }

    public void selectPMOption() {
        clickElement(PMBy);
    }
    public void select6FromCalendar() {
        clickElement(timeBy);
    }
    public void select25MinutesFromCalendar() {
        clickElement(minuteBy);
    }

    public void tapOnOkButtonForChangeTime() {
        clickElement(okButton);
    }

    public void isTimeSelected(String expectedTime) {
        String selectedDateTime = getElement(selecteddateTimeBy).getAttribute("text");
        String selectedTime = selectedDateTime.substring(10);
        Assert.assertEquals(expectedTime, selectedTime);
       
    }

    // ********************
    public void tapChangeTimeSpinnerButton() {
        clickElement(changeTimeSpinnerButtonBy);
        swipe(timeSpinnerBy, "up");
    }
    public void swipeTimetoTwo() {
        
        
        swipe(timeSpinnerBy, "down");
    }
        
    public void swipeToThreeMinutes() {
       // scrollUntilVisibilityOf("03");
       swipe(hoursSpinnerBy, "up");

    //     // String currentHour = getElement(swipeMinuteBy).getAttribute("focusable");
    //     // String previousHour = getElement(minuteBy).getAttribute("focusable");
    //     // assertEquals(currentHour, "true");
    //     // assertEquals(previousHour, "false");;
    }

    // public void isTimeSelectedDispayed(String expectedTime) {
    //     String selectedDateTime = getElement(selecteddateTimeBy).getAttribute("text");
    //     String selectedTime = selectedDateTime.substring(10);
    //     Assert.assertEquals(expectedTime, selectedTime);
        

    // }

}
