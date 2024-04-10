Feature: Date and time widget feature
    @test
    Scenario: Date and time
    When a user tap on views link 
    And the user taps on date widget link
    And the user taps on Dialog link
    And the user taps on change the date button
    And the user select 20 from calendar
    And the user taps ok button and verify if selected "3-20-2024" date is displayed at the top
    And the user taps on change the time button 
    And the user select PM option
    And the user taps on six from the clock
    And the user taps on tweenty five munites
    And the user taps on ok button and verify if selected time "18:25" is displayed at the top
    And the user taps on change the time spinner button 
    And the user swipe to seven on time
    And the user swipe to ten on minutes
    And the user taps on ok button
    Then vefify if the selected time "7:10" has been displayed

   