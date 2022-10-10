##Register
Feature: Registrarse
  @Alba
  Scenario Outline: Registro exitoso

    Given El usuario esta en la pagina de automation practice
    And hace click en el boton mi cuenta
    And ingresa "<usuario>" y "<password>" en el formulario de registro
#    When hace click en el boton register
#    Then ingresa a la pantalla principal de aplicacion web

    Examples:
      |usuario        | password |
      |alba@gmail.com | alba1*234 |


    Scenario Outline: Registro fallido

    Given El usuario esta en la pagina de automation practice
    And hace click en el boton mi cuenta
    And ingresa "<usuario>" y "<password>" en el formulario de registro
    When hace click en el boton register
    Then se visualiza el mensaje "<mensaje>"

    Examples:
      |usuario    | password |mensaje |
      |alba@gmail | alba1*234|Please provide a valid email address|