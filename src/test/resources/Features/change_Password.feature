Feature: This feature file includes all test cases related to Update Password Page of Orangehrm

Scenario: To verify when user enters valid current password,New Password and Confirm Password then it should update password

	When User login successfully
	And User clicks on profile dropdown list
	And Select change password options
	And Enter valid Current Password,Password and Confirm Password
	And Click on Save Button
	Then It should update password successfully

Scenario: To verify when user enters current password as blank then it should display error message as 'Current password do not match'
	
	When User login successfully & clicks on profile dropdown list
	And User enters Current Password as blank
	And Enter Password,Confirm Password & click on Save button
	Then It should show error message as 'Current Password is Incorrect'

Scenario: To verify when user enters current password as numbers only then it should display error message as 'Current password do not match'
	
	When User login successfully & clicks on profile dropdown
	And User enters Current Password as numbers only
	And Enter Password,Confirm Password & click on Save
	Then It should display error message as 'Current Password is Incorrect'

Scenario: To verify when user enters current password as characters only then it should display error message as 'Current password do not match'

	When User login successfully & clicks profile dropdown
	And User enters Current Password as characters only
	And Enter Password,Confirm Password & click on Save Button
	Then It should display error message 'Current Password is Incorrect'

Scenario: To verify when user enters current password as special characters only then it should display error message as 'Current password do not match'

	When User login & clicks profile dropdown
	And User enters Current Password as special characters only
	And Enter Password,Confirm Password & click Save Button
	Then It should display error message 'Current Password is Incorrect'.
	
Scenario: To verify when user enters current password as space only then it should display error message as 'Current password do not match'
	
	When User login and clicks profile dropdown
	And User enters Current Password as space only
	And Enter Password,Confirm Password & click Save button.
	Then It should display error message'Current Password is Incorrect'.
	
Scenario: To verify when user enters current password as alphanumeric then it should update password successfully.
	
	When User login and click profile dropdown.
	And User enters Current Password as alphanumeric
	And Enter Password,Confirm Password,click Save.
	Then Application should update password successfully.

Scenario: To verify when user enters current password as combination of numbers & special characters then it should update password successfully.
	
	When User login successfully & click Dropdown.
	And User enters Current Password as numbers & special characters.
	And User enter Password,Confirm Password,click Save
	Then It should display error msg 'Current Password is Incorrect'.
	
Scenario: To verify when user enters current password as combination of numbers & special characters then it should update password successfully.
	
	When User login & click Dropdown.
	And User enters Current Password as numbers & characters.
	And User enter Password,Confirm Password,click on save.
	Then It should show error msg as 'Current Password is Incorrect'.
<<<<<<< HEAD
=======
@today
Scenario: To verify when user enters current password less than 7 characters then it should update password successfully.
	
	When User login successfully,click Dropdown.
	And User enters Current Password less than 7 characters.
	And User enter Password,Confirm Password,click on Save.
	Then It should show message as 'Current Password is Incorrect'.

	
>>>>>>> 32245d5766665bae1d94bc94a94da6e6bb925421
