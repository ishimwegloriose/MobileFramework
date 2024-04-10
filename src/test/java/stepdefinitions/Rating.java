package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;


public class Rating {
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    ApiDemoPage ratingBarPage;

    @When("the user taps on ratings bar link")
    public void the_user_taps_on_ratings_bar_link() {
        apiDemoPage.scrollToRatingBarLink();
        apiDemoPage.clickOnRatingBar();

    }

    @When("the user taps <ratings> points")
    public void the_user_taps_ratings_points() {
    }

    @Then("verify if selected <RatingResults>")
    public void verify_if_selected_rating_results() {

    }

}
