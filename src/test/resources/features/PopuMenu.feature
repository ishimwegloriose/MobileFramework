Feature: View popup menu feature
    @test
    Scenario: View popup menu
        When a user tap on views link
        And the user taps on popup menu link
        And the user taps on make a popup button
        And The user verify if the menu contains "Search" item 
        Then The user taps on search item
        

