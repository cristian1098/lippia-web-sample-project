Feature: Buscar en el input un producto por su nombre

@smoke
Scenario: el usuario navega a "search"
  Given el usuario navega a la web de automation practice
  When el usuario escribe en el input "search"
  Then el usuario encuentre el objeto buscado

