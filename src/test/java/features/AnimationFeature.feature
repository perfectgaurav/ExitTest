Feature: Animation 
@smoke
@test2
Scenario: Checking Default layout animation feature
Given App is launched 
When User click on Animation
And User click on Default layout animation
And User click on add button
Then User can see a button

@smoke
@test2
Scenario: Checking Events feature
Given App is launched 
When User click on Animation
And User click on Events
And User click on play button
Then Event will happen