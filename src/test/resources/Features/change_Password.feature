Feature: This feature file includes all test cases related to Update Password Page of Orangehrm

Scenario: To verify when user enters valid current password,New Password and Confirm Password then it should update password successfully

	When User login successfully
	And User clicks on profile dropdown list
	And Select change password options
	And Enter valid Current Password,Password and Confirm Password
	And Click on Save Button
	Then It should update password successfully

Scenario: To verify when user enters current password as blank then it should display error message as 'Current Password is Incorrect'
	
	When User login successfully & clicks on profile dropdown list
	And User enters Current Password as blank
	And Enter Password,Confirm Password & click on Save button
	Then It should show error message as 'Current Password is Incorrect'

Scenario: To verify when user enters current password as numbers only then it should display error message as 'Current Password is Incorrect'
	
	When User login successfully & clicks on profile dropdown
	And User enters Current Password as numbers only
	And Enter Password,Confirm Password & click on Save
	Then It should display error message as 'Current Password is Incorrect'

Scenario: To verify when user enters current password as characters only then it should display error message as 'Current Password is Incorrect'

	When User login successfully & clicks profile dropdown
	And User enters Current Password as characters only
	And Enter Password,Confirm Password & click on Save Button
	Then It should display error message 'Current Password is Incorrect'

Scenario: To verify when user enters current password as special characters only then it should display error message as 'Current Password is Incorrect'

	When User login & clicks profile dropdown
	And User enters Current Password as special characters only
	And Enter Password,Confirm Password & click Save Button
	Then It should display error message 'Current Password is Incorrect'.
	
Scenario: To verify when user enters current password as space only then it should display error message as 'Current Password is Incorrect'
	
	When User login and clicks profile dropdown
	And User enters Current Password as space only
	And Enter Password,Confirm Password & click Save button.
	Then It should display error message'Current Password is Incorrect'.
	
Scenario: To verify when user enters current password as alphanumeric then it should update password successfully.
	
	When User login and click profile dropdown.
	And User enters Current Password as alphanumeric
	And Enter Password,Confirm Password,click Save.
	Then Application should update password successfully.

Scenario: To verify when user enters current password as combination of numbers & special characters then it should display error message as 'Current Password is Incorrect'
	
	When User login successfully & click Dropdown.
	And User enters Current Password as numbers & special characters.
	And User enter Password,Confirm Password,click Save
	Then It should display error msg 'Current Password is Incorrect'.
	
Scenario: To verify when user enters current password as combination of numbers & special characters then it should display error message as 'Current Password is Incorrect'
	
	When User login & click Dropdown.
	And User enters Current Password as numbers & characters.
	And User enter Password,Confirm Password,click on save.
	Then It should show error msg as 'Current Password is Incorrect'.

Scenario: To verify when user enters current password less than 7 characters then it should display error message as 'Current Password is Incorrect'
	
	When User login successfully,click Dropdown.
	And User enters Current Password less than 7 characters.
	And User enter Password,Confirm Password,click on Save.
	Then It should show message as 'Current Password is Incorrect'.
	
Scenario: To verify when user enters valid current password along with space then it should display error message as 'Current Password is Incorrect'
	
	When User login successfully and click the profile Dropdown.
	And User enters valid Current Password along with spaces.
	And User enter Password,Confirm Password & clicks on Save.
	Then It should display msg as 'Current Password is Incorrect'.

Scenario: To verify when user enters New password as alphanumeric more than 7 characters then it should update password successfully.
	
	When User login successfully and clicks the profile DropDown
	And User enters current Password & New Password as alphanumeric.
	And User enters Confirm Password & clicks on Save.
	Then It should update password successfully.

Scenario: To verify when user enters New password as alphanumeric less than 7 characters then it should display error as 'Password must be alphanumeric with atleast seven characters'
	
	When User login successfully, clicks the profile DropDown
	And User enters current Password & New Password as alphanumeric less than 7 characters
	And User enters Confirm Password & click on Save
	Then It should display msg as 'Password must be alphanumeric with atleast seven characters'.

Scenario: To verify when user enters New password as numbers more than 7 characters then it should display error as 'Password must be alphanumeric with atleast seven characters'
	
	When User login successfully, clicks the profile DropDown for New Password
	And User enters current Password & New Password as numbers more than 7 characters
	And User enters Confirm Password & click on Save button for New Password
	Then It should display error msg as 'Password must be alphanumeric with atleast seven characters'.

Scenario: To verify when user enters New password as special characters more than 7 characters then it should display error as 'Password must be alphanumeric with atleast seven characters'
	
	When User login successfully, clicks the profile DropDown for New Password as Special Characters
	And User enters current Password & New Password as Special Characters more than 7 characters
	And User enters Confirm Password & click on Save button for New Password Special Characters
	Then It should display error msg as 'Password must be alphanumeric with atleast seven characters' for Special Characters.

Scenario: To verify when user enters New password as characters more than 7 characters then it should display error as 'Password must be alphanumeric with atleast seven characters'
	
	When User login successfully, clicks the profile DropDown for New Password as Characters
	And User enters current Password & New Password as Characters more than 7 characters
	And User enters Confirm Password & click on Save button for New Password Characters
	Then It should display error msg as 'Password must be alphanumeric with atleast seven characters' for Characters

Scenario: To verify when user enters New password as combination of Special Characters & characters then it should display error as 'Your password must contain minimum 1 number'
	
	When User login & click DropDown for New Password for Combination of SC
	And Enter current Password & New Password as combination of Sp characters & characters
	And Enter Confirm Password & click on Save button for New Password Characters & Sp characters
	Then It should display error msg as 'Your password must contain minimum 1 number' for combination.
	
Scenario: To verify when user enters New password as space then it should display error as 'Password must be alphanumeric with atleast seven characters'
	
	When User login & click DropDown for New Password for space
	And Enter current Password & New Password as space
	And Enter Confirm Password & click on Save button for New Password space
	Then It should display error msg as 'Password must be alphanumeric with atleast seven characters' for space.

Scenario: To verify when user enters New password as blank then it should display error as 'Password must be alphanumeric with atleast seven characters'
	
	When User login & click DropDown for New Password for blank
	And Enter current Password & New Password as blank
	And Enter Confirm Password & click on Save button for New Password blank
	Then It should display error msg for blank password as 'Password must be alphanumeric with atleast seven characters'.

Scenario: To verify when user enters Confirm password as blank then it should display error as 'Passwords do not match'
	
	When User login & click DropDown for Confirm Password as blank
	And Enter current Password,New Password,confirm Password as blank and click on Save
	Then It should display error msg confirm password as 'Passwords do not match'for blank.
	
Scenario: To verify when user enters Confirm password as space then it should display error as 'Passwords do not match'
	
	When User login & click DropDown for Confirm Password as space
	And Enter current Password,New Password,confirm Password as space and click on Save
	Then It should display error msg confirm password as 'Passwords do not match'for space.
	
Scenario: To verify when user enters Confirm password as numbers then it should display error as 'Passwords do not match'
	
	When User login & click DropDown for Confirm Password as numbers
	And Enter current Password,New Password,confirm Password as numbers and click on Save
	Then It should display error msg confirm password as 'Passwords do not match'for numbers.

Scenario: To verify when user enters Confirm password as characters then it should display error as 'Passwords do not match'
	
	When User login & click DropDown for Confirm Password as characters
	And Enter current Password,New Password,confirm Password as characters and click on Save
	Then It should display error msg confirm password as 'Passwords do not match'for characters.

Scenario: To verify when user enters Confirm password as Special characters then it should display error as 'Passwords do not match'
	
	When User login & click DropDown for Confirm Password as Sp characters
	And Enter current Password,New Password,confirm Password as Sp characters and click on Save
	Then It should display error msg confirm password as 'Passwords do not match'for Sp characters.

Scenario: To verify when user enters Confirm password as alphanumeric exactly same as password then it should update password successfully
	
	When User login & click DropDown for Confirm Password as alphanumeric
	And Enter current Password,New Password,confirm Password as alphanumeric and click on Save
	Then It should update password successfully for alphanumeric confirm password

Scenario: To verify when user enters all password and click on cancel button then it should redirected to dashboard 
	
	When User login & click DropDown for cancel button
	And Enter current Password,New Password,confirm Password 
	And click on cancel button
	Then It should redirected to dashboard
	
Scenario: To verify when user enters current password and click on cancel button then it should redirected to dashboard 
	
	When User login & click DropDown for cancel of update password
	And Enter current Password and click on cancel button
	Then It should go to dashboard
	
Scenario: To verify when user enters new password and click on cancel button then it should redirected to dashboard 
	
	When User login and click DropDown for cancel option.
	And Enter Password and click on cancel button
	Then It should redirect to dashboard.
	
Scenario: To verify when user enters confirm password and click on cancel button then it should redirected to dashboard 
	
	When login & click DropDown for cancel button
	And Enter confirm Password and click on cancel button
	Then It should redirected to dashboard page
	