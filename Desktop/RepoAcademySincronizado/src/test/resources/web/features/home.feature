@Home
Feature: Pagina de inicio


  Scenario: Validar exitosamente que existan tres slider en la pagina de inicio

    Given El usuario esta en la pagina de automation practice
    And hace click en el boton shop
    When hace click en el boton home
    Then recorre la pantalla visualizando tres sliders



    Scenario Outline: Verificar exitosamente que se visualiza el boton añadir al carrito de compras

      Given El usuario esta en la pagina de automation practice
      And hace click en el boton shop
      And hace click en el boton home
      And recorre la pantalla visualizando tres sliders
      When selecciona la opcion "<opcion>"
      Then se visualiza el boton de añadir al carrito

      Examples:
      | opcion               |
      | Selenium Ruby        |
      | Thinking in HTML     |
      | Mastering JavaScript |