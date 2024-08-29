Feature: Assessment Login scenarios

  Scenario: Test case 1: Positive test (valid username and password)
    Given  page header should display as "Test login"
    When enter "valid" username
    And enter "valid" password
    And click submit button
    And valid header in landing page as "Logged In Successfully"
    Then logout from app

  Scenario: Test case 2: Negative username test (incorrect username and valid password)
    Given  page header should display as "Test login"
    When enter "incorrect" username
    And enter "valid" password
    And click submit button
    Then "Your username is invalid!" error should display

  Scenario: Test case 3: Negative password test (valid username and incorrect password)
    Given  page header should display as "Test login"
    When enter "valid" username
    And enter "incorrect" password
    And click submit button
    Then "Your password is invalid!" error should display

  Scenario: Test case 4: Empty username and password
    Given  page header should display as "Test login"
    When click submit button
    Then "Your username is invalid!" error should display
