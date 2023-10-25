Feature: Login the system

  As a user
  I want to login the system
  So that I can see my data

  Scenario Outline: Validating credentials
    Given I access the login page
    When I fill the email field with <email>
    And I fill the password field with <password>
    And I hit the button login
    Then I should see the email alert <email alert>
    And I should see the password alert <password alert>

    Examples:
      |email                   |password      | email alert                       |password alert|
      |"maryribeiro@gmailcom"  |"123698"      |"Email deve ser um email válido"   |    ""        |
      |""                      |"123456"      |"Email é obrigatório"              |              |
      |"jorgelacerda@gmailcom" |""            |"Password é obrigatório"           |              |
