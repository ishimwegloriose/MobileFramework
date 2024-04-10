package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;
import pages.LongClickPage;

public class LongClick {
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    LongClickPage longClickPage;

    @When("the user taps on expandable lists link")
    public void the_user_taps_on_expandable_lists_link() {
        apiDemoPage.tapOnExpandableList();
    }

    @When("the user taps on custom adapter link")
    public void the_user_taps_on_custom_adapter_link() {
        longClickPage = apiDemoPage.tapOnCustomAdapter();
    }

    @When("the user longClick on cat names link")
    public void the_user_long_click_on_cat_names_link() {
        longClickPage.longClickOnCatNames();
    }

    @Then("verify a popup with title {string} should be displayed")
    public void verify_a_popup_with_title_should_be_displayed(String string) {
        longClickPage.verifySampleMenuTitleIsVisible(string);

    }

    @Then("the user taps on sample action link")
    public void the_user_taps_on_sample_action_link() {
        longClickPage.tapOnSampleActionLink();
    }

    // @Then("the user verify if toasted message {string} is displayed")
    // public void the_user_verify_if_toasted_message_is_displayed(String string) {
    // longClickPage.verifySampleActionLinkIsClicked(string);
    // }

}
