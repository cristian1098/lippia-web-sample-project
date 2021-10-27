package lippia.web.steps;

import com.crowdar.core.PageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import lippia.web.services.InputSearchService;

public class InputSearchSteps extends PageSteps {




    @Given("el usuario navega a la web de automation practice")
        public void elUsuarioNavegaALaWebDeAutomationPractice(){
        InputSearchService.navegarWeb();
    }
    
    @When("^el usuario escribe en el input \"(.*)\"$")
    public void elUsuarioEscribeEnElInput(String busqueda){
        InputSearchService.setSearchInput(busqueda);
    }



    @Then("^el usuario encuentre la palabra buscada \"(.*)\"$")
    public void elUsuarioEncuentreLaPalabraBuscada(String busqueda) {
        InputSearchService.verificarBusqueda(busqueda);
    }

    @And("el usuario clickea el boton buscar")
    public void elUsuarioClickeaElBotonBuscar() {
        InputSearchService.clickSearchButton();
    }



}
