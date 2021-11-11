Feature: hacer un login

  @Smoke @Ignore
  Scenario Outline: el usuario ingresa a login
    Given el usuario navega a la web de login
    When el usuario ingresa sus credenciales "<email>" "<password>"
    And el usuario hace click en el boton sign in
    Then el usuario ingresa a su cuenta
    Examples:
      | email                     | password        |
      | cfernandezpando@gmail.com | ccPB62!nygw4UKB |






