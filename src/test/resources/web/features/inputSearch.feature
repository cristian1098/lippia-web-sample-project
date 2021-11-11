Feature: Buscar en el input un producto por su nombre

@Smoke @Ignore
  Scenario Outline: el usuario navega a "search"
    Given el usuario navega a la web de automation practice
    When el usuario escribe en el input "<busqueda>"
    And el usuario clickea el boton buscar
    Then el usuario encuentre la palabra buscada "<busqueda>"
    Examples:
      | busqueda |
      | hat      |
      | dress    |

  @Smoke
  Scenario Outline: el usuario navega a "search"
    Given el usuario navega a la web de automation practice
    When el usuario escribe en el input "<busqueda>"
    And el usuario clickea el boton buscar
    And el usuario ordena los articulos de menor a mayor
    Then el usuario verifica que la lista de precios esta ordenada
    Examples:
      | busqueda |
      | short    |

