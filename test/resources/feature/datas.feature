Feature: Add customer automating

  # Scenario: Add customer plan
   # Given user can launch the browser
    # When user can enter all the fields
    # Then user can enter the submit button

  # Scenario: Add customer plan one dimensional plan
   # Given user can launch the browser
   #  When user can enter all the field
    #  | ajith | rajan | ramav@gmail.com | chennai | 12344556667 |
    # Then user can enter the submit button

  # Scenario: add customer with One Dimensional list
   # Given user can launch the browser
    # When user enters all the field.
     # | fname   | raja           |
     # | lname   | raghu          |
     # | email   | mani@gmail.com |
      #| address | coimbatore     |
      #| phno    |     9894738448 |
   # Then user can enter the submit button
   Scenario Outline: 
  Given user can launch the browser
    
    When user enters all the fields"<fname>","<lname>","<email>","<address>","<phno>"
   Then user can enter the submit button

    Examples: 
      | fname    | lname | email           | address | phno        |
      | java     | rajan | ramav@gmail.com | chennai | 12344556667 |
      | selenium | rajan | ramav@gmail.com | chennai | 12344556667 |
      | cucumber | rajan | ramav@gmail.com | chennai | 12344556667 |
      | testng   | rajan | ramav@gmail.com | chennai | 12344556667 |
      | junit    | rajan | ramav@gmail.com | chennai | 12344556667 |