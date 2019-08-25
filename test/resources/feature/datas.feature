Feature: Add customer automating
  
  Background:
  Given user can launch the browser
  Then user can enter the submit button
  
  @sanity
  Scenario: Add customer plan
    When user can enter all the fields
    @smoke
  Scenario: Add customer plan one dimensional plan
    When user can enter all the field
      | ajith | rajan | ramav@gmail.com | chennai | 12344556667 |
  Scenario: add customer with One Dimensional list
    When user enters all the field.
      | fname   | raja           |
      | lname   | raghu          |
      | email   | mani@gmail.com |
      | address | coimbatore     |
      | phno    |     9894738448 |
  Scenario Outline: 
    When user enters all the fields"<fname>","<lname>","<email>","<address>","<phno>"
    Examples: 
      | fname    | lname | email           | address | phno        |
      | java     | rajan | ramav@gmail.com | chennai | 12344556667 |
      | selenium | rajan | ramav@gmail.com | chennai | 12344556667 |
      | cucumber | rajan | ramav@gmail.com | chennai | 12344556667 |
      | testng   | rajan | ramav@gmail.com | chennai | 12344556667 |
      | junit    | rajan | ramav@gmail.com | chennai | 12344556667 |
