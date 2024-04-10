package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;
import pages.DialogPage;

public class DatesWidget {
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    DialogPage dialogPage;

    @When("the user taps on date widget link")
    public void the_user_taps_on_date_widget_link() {
        apiDemoPage.tapOnDateWidgetLink();

    }

    @When("the user taps on Dialog link")
    public void the_user_taps_on_dialog_link() {
        dialogPage = apiDemoPage.tapOnDialogLink();

    }

    @When("the user taps on change the date button")
    public void the_user_tap_on_change_the_date_button() {
        dialogPage.tapChangeDateButton();

    }

    @When("the user select 20 from calendar")
    public void the_user_select_20_from_calendar() {
        dialogPage.select20MarchFromCalendar();

    }

    @When("the user taps ok button and verify if selected {string} date is displayed at the top")
    public void the_user_taps_ok_button(String string) {
        dialogPage.tapOnOkButton();
        dialogPage.isDateSelected(string);
    }

    @Then("the user verify if selected {string} date is displayed at the top")
    public void the_user_verify_if_selected_date_is_displayed_at_the_top(String string) {
        dialogPage.isDateSelected(string);

    }

    // ****
    @When("the user taps on change the time button")
    public void the_user_taps_on_change_the_time_button() {
        dialogPage.tapChangeTimeButton();

    }

    @When("the user select PM option")
    public void the_user_select_pm_option() {
        dialogPage.selectPMOption();

    }

    @When("the user taps on six from the clock")
    public void the_user_taps_on_six_from_the_clock() {
        dialogPage.select6FromCalendar();

    }

    @When("the user taps on tweenty five munites")
    public void the_user_taps_on_tweenty_five_munites() {
        dialogPage.select25MinutesFromCalendar();

    }

    @When("the user taps on ok button and verify if selected time {string} is displayed at the top")
    public void the_user_taps_on_ok_button_and_verify_if_selected_time_is_displayed_at_the_top(String string) {
        dialogPage.tapOnOkButton();
        dialogPage.isTimeSelected(string);

    }

    // ****
    @When("the user taps on change the time spinner button")
    public void the_user_taps_on_change_the_time_spinner_button() {
        dialogPage.tapChangeTimeSpinnerButton();

    }

    @When("the user swipe to seven on time")
    public void the_user_swipe_to_seven_on_time() {
        dialogPage.swipeTimetoTwo();

    }

    @When("the user swipe to ten on minutes")
    public void the_user_swipe_to_ten_on_minutes() {
        dialogPage.swipeToThreeMinutes();

    }

    @When("the user taps on ok button")
    public void the_user_taps_on_on_button() {
        dialogPage.tapOnOkButton();

    }

    @Then("vefify if the selected time {string} has been displayed")
    public void vefify_if_the_selected_time_has_been_displayed(String string) {
        // dialogPage.isTimeSelected(string);

    }

   

}
