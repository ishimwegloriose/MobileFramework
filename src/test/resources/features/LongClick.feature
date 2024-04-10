Feature: Long Click feature
     @test
    Scenario: Long Click on element
    When a user tap on views link
    And the user taps on expandable lists link
    And the user taps on custom adapter link
    And the user longClick on cat names link
    And  verify a popup with title "Sample menu" should be displayed
    Then the user taps on sample action link
    # Then the user verify if toasted message "Cat Names: Group 2 clicked" is displayed
  