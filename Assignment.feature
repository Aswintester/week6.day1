Feature: leaftaps login functionality

#Background:

#Given open the chrome browser
#And Load the 'http://leaftaps.com/opentaps'

Scenario Outline: Test with positive credentials

Given Enter username as <username>
And Enter password as <password>
When click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemosCSR'|'crmsfa'|

Scenario Outline: Test with negative credentials

Given Enter username as <username>
And Enter password as <password>
When click on login button
But Error should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemosCSR'|'crmsfa'|

Scenario: Opening Create Lead Page

Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When click on login button
Then Homepage should be displayed
When click on CRMSFA link
Then Leads HomePage should be opened
When click on Create Leads
Then CreateLead Page should be opened


