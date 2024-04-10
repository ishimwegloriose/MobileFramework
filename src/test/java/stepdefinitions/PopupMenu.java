package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;
import pages.PopupMenuPage;

public class PopupMenu {
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    PopupMenuPage popupMenuPage;

    // @When("a user tap on views link")
    // public void a_user_tap_on_views_link() {
    // apiDemoPage.clickOnViews();
    // }

    @When("the user taps on popup menu link")
    public void the_user_taps_on_popup_menu_link() {
        apiDemoPage.scrollToView();
        popupMenuPage = apiDemoPage.clickPopupMenuLink();

    }

    @When("the user taps on make a popup button")
    public void the_user_taps_on_make_a_popup_button() {
        popupMenuPage.clickMakePopup();

    }

    @And("The user verify if the menu contains {string} item")
    public void the_menu_should_contains_item1(String string) {
        popupMenuPage.viewSearchItemOnMenu(string);

    }

    @Then("The user taps on search item")
    public void the_menu_should_contains_item() {
        popupMenuPage.selectSearchItem();

    }

    @Then("taps on search item")
    public void the_menu_should_contains_item(String string) {
        popupMenuPage.VerifyIfSearchClicked(string);

    }

}
