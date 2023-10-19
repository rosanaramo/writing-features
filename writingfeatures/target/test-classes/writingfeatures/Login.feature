Feature: Login on the system

  Scenario Outline: Credentials are not valid
    Given I access the login page
    When I fill the email field with <email>
    And I fill the password field with <password>
    Then I should see the <result> message


    Examples:
      |email                   |password|result|
      |"maryribeiro@gmailcom"  |"123698"|      |
      |"jorgelacerda@gmailcom" |"123444"|      |
      |"brunodeluca@yahoo.com" |"123698"|      |