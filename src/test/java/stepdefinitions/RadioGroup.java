package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;
import pages.RadioGroupPage;

public class RadioGroup {
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    RadioGroupPage radioGroupPage;

    @When("the user taps on radio group link")
    public void the_user_taps_on_radio_group_link() {
        apiDemoPage.scrollToRadioGroup();
        radioGroupPage = apiDemoPage.clickRadioGroup();

    }

    @When("the user select snack")
    public void the_user_select_snack() {
        radioGroupPage.selectSnack();

    }

    @Then("The user taps on clear button")
    public void the_user_taps_on_clear_button() {
        radioGroupPage.ClickClearButton();

    }

}
