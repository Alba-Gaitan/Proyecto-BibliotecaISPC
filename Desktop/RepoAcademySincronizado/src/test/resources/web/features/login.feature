  #Login
  Feature: Login

    Scenario Outline: Login exitoso

      Given El usuario esta en la pagina de automation practice
      And hace click en el boton mi cuenta
      And ingresa "<usuario>" y "<password>"
      When hace click en el boton login
      Then ingresa a la pantalla principal de aplicacion web

      Examples:
        |usuario                  | password |
        |albagaitan.fsk@gmail.com | alba1234* |


    Scenario Outline: Cerrar sesion exitosamente

      Given El usuario esta en la pagina de automation practice
      And hace click en el boton mi cuenta
      And ingresa "<usuario>" y "<password>"
      When hace click en el boton login
      And hace click en el boton logout
      Then se verifica que cierra sesion exitosamente

      Examples:
        |usuario                  | password |
        |albagaitan.fsk@gmail.com | alba1234* |