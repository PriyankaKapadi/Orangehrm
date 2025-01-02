Feature: This feature file includes all the testcases related to Qualifications dropdown option of orangeHRM 

Scenario: To verify when user click on Qualification dropdown and select Skills option

	When User login successfully for qualification dropdown
	And select Admin option on Home page 
	And user click on qualification dropdown menu on Home page
	And select Skills option
	Then It should redirect to Skill page

Scenario: To verify when user click on Add button 

	When User login successfully and select Admin Option
	And click on qualification dropdown menu for add skill page
	And select Skills option for add skill page
	And click on add button for add skill page
	Then It should redirect to add skill page

Scenario: To verify when user keeps Name field as blank and click on save button 

	When User login successfully and select Admin Option for blank name
	And click on qualification dropdown menu for Name field as blank
	And select Skills option for Name field as blank
	And click on add button for Name field as blank
	And Keep Name field as blank
	And click on Save button
	Then It should show error message as 'Please Enter The valid skill'

Scenario: To verify when user enters space in Name field

	When User login successfully and select Admin Option for name as space
	And click on qualification dropdown menu for Name field as space only
	And select Skills option for Name field as space only
	And click on add button for Name field as space only
	And Keep Name field as space only
	And click on Save button for space only
	Then It should show error message as 'Please Enter The valid skill' for space only
	
Scenario: To verify when user enters Special Characters only in Name field

	When User login successfully and select Admin Option for sp char 
	And click on qualification dropdown menu for Name field as sp char only
	And select Skills option for Name field as sp char only
	And click on add button for Name field as sp char only
	And Keep Name field as sp char only
	And click on Save button for sp char only
	Then It should show error message as 'Please Enter The valid skill' for sp char only

Scenario: To verify when user enters Numbers only in Name field

	When User login successfully and select Admin Option for number only
	And click on qualification dropdown menu for Name field as numbers only
	And select Skills option for Name field as numbers only
	And click on add button for Name field as numbers only
	And Keep Name field as numbers only
	And click on Save button for numbers only
	Then It should show error message as 'Please Enter The valid skill' for num

Scenario: To verify when user enters combination of character and number in Name field

	When User login successfully and select Admin Option for character and number
	And click on qualification dropdown menu for Name field as combination of character and number
	And select Skills option for Name field as combination of character and number
	And click on add button for Name field as combination of character and number
	And Keep Name field as combination of character and number
	And click on Save button for combination of character and number
	Then It should show error message as 'Please Enter The valid skill' for combination of character and number

Scenario: To verify when user enters combination of Special character and Character in Name field

	When User login successfully and select Admin option for sp and char
	And click on qualification dropdown menu for Name field as combination of sp and char
	And select Skills option for Name field as combination of sp and char
	And click on add button for Name field as combination of sp and char
	And Keep Name field as combination of sp and char
	And click on Save button for combination of sp and char
	Then It should show error message as 'Please Enter The valid skill' for combination of sp and char

Scenario: To verify when user enters combination of Special character and number in Name field

	When User login successfully and select admin for sp and num
	And click on qualification dropdown menu for Name field as combination of sp and num
	And select Skills option for Name field as combination of sp and num
	And click on add button for Name field as combination of sp and num
	And Keep Name field as combination of sp and num
	And click on Save button for combination of sp and num
	Then It should show error message as 'Please Enter The valid skill' for combination of sp and num

Scenario: To verify when user enters name as more than 120 characters

	When User login successfully and select Admin for max char
	And click on qualification dropdown menu for Name with max limit
	And select Skills option for Name with max limit
	And click on add button for Name with max limit
	And Keep Name with max limit
	And click on Save button for max limit
	Then It should show error message as 'Should not exceed 120 characters' for max limit
