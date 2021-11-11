package lippia.web.steps;

import com.crowdar.core.PageSteps;

import io.cucumber.java.en.*;

import lippia.web.constants.Practica1Constants;
import lippia.web.services.LoginService;
import lippia.web.services.InputSearchService;

public class PracticeWebSteps extends PageSteps {


    @Given("el usuario navega a la web de login")
    public void elUsuarioNavegaALaWebDeAutomationLogin() {
        LoginService.navegarLogin();
    }

    @When("^el usuario escribe en el input \"(.*)\"$")
    public void elUsuarioEscribeEnElInput(String busqueda) {
        InputSearchService.setSearchInput(busqueda);
    }

    @When("el usuario clickea el boton sign in")
    public void elUsuarioClickeaElBotonSignIn() {
        LoginService.clickSignIn();
    }
    @And("el usuario ingresa sus credenciales \"(.*)\" \"(.*)\"")
    public void elUsuarioIngresaDatos(String email,String password){
     LoginService.enviarEmail(email);
     LoginService.enviarPass(password);

    }



    @And("el usuario clickea el boton buscar")
    public void elUsuarioClickeaElBotonBuscar() {
        InputSearchService.clickSearchButton();
    }

    @And("el usuario hace click en el boton sign in")
    public void elUsuarioEnviaLosDatos() {
        LoginService.clickSubmit();
    }

    @Then("^el usuario encuentre la palabra buscada \"(.*)\"$")
    public void elUsuarioEncuentreLaPalabraBuscada(String busqueda) {
        InputSearchService.verificarBusqueda(busqueda);
    }


    @Then("el usuario verifica que el precio este ordenado de menor a mayor")
    public void elUsuarioVerificaQueElPrecioEsteOrdenadoDeMenorAMayor() {
    }

    @Then("el usuario ingresa a su cuenta")
    public void elUsuarioIngresaASuCuenta() {
        LoginService.verificarSignIn();
    }

    @Given("el usuario navega a la web de automation practice")
    public void elUsuarioNavegaALaWebDeAutomationPractice() {
        InputSearchService.navegarInputSearch();
    }

    @And("el usuario ordena los articulos de menor a mayor")
    public void elUsuarioOrdenaLosArticulosDeMenorAMayor() {
        InputSearchService.ordenarDeMenorAMayor();

    }

    @Then("el usuario verifica que la lista de precios esta ordenada")
    public void elUsuarioVerificaQueLaListaDePreciosEstaOrdenada() {
        InputSearchService.verifyList();
    }
}
