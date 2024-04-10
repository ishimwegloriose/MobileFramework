Feature: DropDown feature
    @test
    Scenario: Select an item from the dropdown list
    When a user tap on views link
    And the user taps on animation link
    And the user taps on push link
    And the user taps on dropdown icon
    And the user select push left item
    Then verify if "Push left" item is selected