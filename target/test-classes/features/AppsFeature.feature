Feature:App

@test4
Scenario Outline: App Option
Given App is launched
When User choose app
And User choose activity
And User choose custom title
And User fills form excel data "<SheetName>" and rownumber <row> and click on change left
Then User can see changes on left top corner

Examples:
|SheetName|row|
|TextBox|0|
|TextBox|1|