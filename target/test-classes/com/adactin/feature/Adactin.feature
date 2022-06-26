Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario: user Login Into The Web Application

Given user Launch The Application

When user Enter The Username In Username Field

And user Enter The Password In Password Field

Then user Click The Login Button and It Navigate To The Search Hotel Page
@SmokeTest
Scenario: user Move To Select Location Page

When user Select  location Of The Hotel

And user Select  Name Of The Hotel

And user Select  Roomtype In Hotel

And user Select The Numberofrooms In Hotel

And user Enter the  Checkindate  

And user Enter The  Checkoutdate

And user Select Adults Per Room

And user Select Children Per Room

Then user Click The Search Button And It Will Navigate To Select Hotel Page
@SmokeTest
Scenario: user Move To Select Hotel Page

When user Click The Radio Button To Select Hotel

Then user Click Continue Button And It Will Navigate To Book Hotel Page
@SmokeTest
Scenario: user Move TO Book Hotel Page

When user Enter The Firstname In Firstname Field

And user Enter The Lastname In Lastname Field

And user Enter The Billing Address In Billing Address Field

And  user Enter The  Sixteen  Digit Credit Card Number In Respective Filed

And user Select The Credit Card Type

And user Select The Month In Expiry Date Field

And user Select The Year In Expiry Date Field

And user Enter The Cvv Number In Respective Field
@Smoketest
Scenario: user Move TO Booking Confirmation Page

Then user Click The Booknow Button And It Will Navigate To Booking Confirmation Page
@SmokeTest
Scenario: user Move To Logout Page

Then user Click The Logout Button And It Will Logout The User 

