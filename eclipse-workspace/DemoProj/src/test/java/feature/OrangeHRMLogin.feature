Feature: Login to HRM Application

Scenario Outline: Login with valid credentials
   Given User is on HRMLogin page
   When User enters username as "Admin" and "admin123"
   Then User should be able to login successfully and home page is displayed
   And User should logout
 Examples: 
     | username | password |
     | test     |test123   |
     | Admin    |admin123  |+
     
     
     