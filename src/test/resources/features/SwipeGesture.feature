Feature: Swipe
    @test
    Scenario: Swipe in four positions
    When a user tap on views link
    And the user swipes to the bottom and verify if "WebView3" is visible
    And the user swipes back to the top and verify if "Animation" is visible
    And the user taps on Gallery link
    And the user taps on Photos link
    And the user swipes two images to the left
    Then the use swipes two images to the right