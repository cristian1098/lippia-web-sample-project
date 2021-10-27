Feature: Buscar en el input un producto por su nombre


  Scenario Outline: el usuario navega a "search"
    Given el usuario navega a la web de automation practice
    When el usuario escribe en el input "<busqueda>"
    And el usuario clickea el boton buscar
    Then el usuario encuentre la palabra buscada "<busqueda>"
    Examples:
      | busqueda |
      | hat      |
      | dress    |

