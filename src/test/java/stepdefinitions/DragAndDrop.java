package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiDemoPage;
import pages.DragAndDropPage;

public class DragAndDrop {

    ApiDemoPage apiDemoPage = new ApiDemoPage();
    DragAndDropPage dragAndDropPage;

    @When("a user tap on views link")
    public void a_user_tap_on_views_link() {
        apiDemoPage.clickOnViews();
    }

    @When("the user tap on Drag and Drop link")
    public void the_user_tap_on_drag_and_drop_link() {
        dragAndDropPage = apiDemoPage.clickDragAndDrop();
    }

    @When("the user drag and drop textless circle")
    public void the_user_drag_and_drop_textless_circle() {
        dragAndDropPage.dragTextLessCircle();

    }

    @Then("the message {string} should be displayed")
    public void the_message_should_be_displayed(String string) {
        dragAndDropPage.dragAndDropCheckResult(string);
    }
}
