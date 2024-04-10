package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;
import pages.BasePage;
import pages.SwipePage;

public class Swipe extends BasePage {
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    SwipePage swipePage;

    @When("the user swipes to the bottom and verify if {string} is visible")
    public void the_user_swipes_to_the_botton_and_verify_if_is_visible(String string) {
        apiDemoPage.swipeBottom();
        apiDemoPage.verifyWebView3IsVisible(string);

    }

    @When("the user swipes back to the top and verify if {string} is visible")
    public void the_user_swipes_back_to_the_top_and_verify_if_is_visible(String string) {
        apiDemoPage.swipeTop();
        apiDemoPage.verifyAniamtionIsVisible(string);

    }

    @When("the user taps on Gallery link")
    public void the_user_taps_on_gallery_link() {
        apiDemoPage.tapOnGalleryLink();

    }

    @When("the user taps on Photos link")
    public void the_user_taps_on_photos_link() {
        swipePage = apiDemoPage.tapOnPhoto();

    }

    @When("the user swipes two images to the left")
    public void the_user_swipes_two_images_to_the_left() {
        swipePage.swipeSecondImageLeft();
        swipePage.isSecondImageSwiped();

    }

    @Then("the use swipes two images to the right")
    public void the_use_swipes_two_images_to_the_right() {
        swipePage.swipeThirdImageRight();
        swipePage.isThirdImageSwiped();

    }

}
