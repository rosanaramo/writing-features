Feature: Login the system

  As a user
  I want to login the system
  So that I can see my data

  Scenario Outline: Validating credentials
    Given I access the login page
    When I fill the email field with <email>
    And I fill the password field with <password>
    And I hit the button login
    Then I should see the <result> message

    Examples:
      |email                   |password      | result|
      |"maryribeiro@gmailcom"  |"123698"      |"Email deve ser um email válido"     |
#      |"jorgelacerda@gmailcom" |"123444"|      |