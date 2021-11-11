Feature: Buscar en el input un producto por su nombre

@Cristian
  Scenario: el usuario navega a "search"
    Given el usuario navega a la web de automation practice
    When el usuario escribe en el input "hat+dress"
    Then el usuario verifica que el precio este ordenado de menor a mayor



