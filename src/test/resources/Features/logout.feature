Feature: This feature file includes all the testcases related to logout of orangeHRM 

Scenario: To verify when user click on Logout button then user should redirect to login page

When User enters valid username, password and click on login button
And Click on user profile dropdown
And Click on logout button
Then It should successfully redirected to Login page of orangeHRM