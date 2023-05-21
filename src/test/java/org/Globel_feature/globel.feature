Feature: validate the functionality of global application.
Scenario: home page 
Given user lanch the global application
When  user enter the name in name required field
And  user enter the Email id in email required field
And user enter the uers's website in website field
And user select experience in experience field
And user choose Expertise in field
And user choose education in education field
Then user click alert box it is redirects to confirm alert 