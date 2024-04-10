package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;

public class ScrollToElement {
    ApiDemoPage apiDemoPage = new ApiDemoPage();

    @When("the user scroll down to TextClocks link")
    public void the_user_scroll_down_to_text_clocks_link() {
        apiDemoPage.scrollToTextClock();
    }

    @Then("then user up to Animation link")
    public void then_user_up_to_link() {
        apiDemoPage.scrollToAnimation();
    }

}
