Feature: Views Feature
@smoke
  @test4
  Scenario: Checking views Feature
    Given App started
    When User clicks on views button
    And User clicks on gallery
    And clicks on photos
    Then photos page landed on screen


