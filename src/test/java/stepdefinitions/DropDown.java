package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;
import pages.DropdownPage;

public class DropDown {
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    DropdownPage dropdownPage;

    @When("the user taps on animation link")
    public void the_user_taps_on_animation_link() {
        apiDemoPage.clickOnAnimationLink();

    }

    @When("the user taps on push link")
    public void the_user_taps_on_push_link() {
        dropdownPage = apiDemoPage.clickOnPushLink();
    }

    @When("the user taps on dropdown icon")
    public void the_user_taps_on_dropdown_icon() {
        dropdownPage.isDropdownIconClicked();
        dropdownPage.tapOnDropDownIcon();

    }

    @When("the user select push left item")
    public void the_user_select_push_left_item() {
        dropdownPage.tapOnPushLeftLink();

    }

    @Then("verify if {string} item is selected")
    public void verify_if_item_is_selected(String string) {
        dropdownPage.verifyIfPushLeftIsSelected(string);

    }

}
