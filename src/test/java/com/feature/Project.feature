Feature: Booking hotel with adactin application

Scenario:Check login functionality
Given user launches the application
When user enter the username in the username field
And user enter the password in the password field
Then user clicks ths login button and navigates to search hotel page


Scenario: Search hotel page
When user select the location from the dropdown 
And user select the hotel from the dropdown
And user select the roomtype from the dropdown
And user select the number of room  from the dropdown
And user enter the checkin date in the check in field
And user enter the checkout date in the check out field
And user select the Number of adults per room from the dropdown
And  user select the Number of children per room from the dropdown
Then user clicks the search button and navigates to select hotel page

Scenario: Select hotel page
When user click the radio button
Then user clicks the continue button and navigates to book a hotel page

Scenario: Book a hotel page
When user enter the first name in the first name field
And user enter the last name in the last name field
And user enter the address in the billing addres field
And user enter the credit card number in the credit card no field
And user select the cardtype from the dropdown
And user select the expiry month from the dropdown
And user select the expiry year from the dropdown
And user enter the CVV number in the cvv number field
Then user clicks the book now button and navigates to booking Confirmation page

Scenario: Booking Confirmation page
Then  user clicks the logout button


