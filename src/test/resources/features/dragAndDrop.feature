Feature: Drag and Drop

    @test
    Scenario: drag and drop 
        When a user tap on views link
        And the user tap on Drag and Drop link
        And the user drag and drop textless circle
        Then the message "Dropped!" should be displayed