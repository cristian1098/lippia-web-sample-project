package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Practica1Constants;
import org.testng.Assert;


import java.util.Locale;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class InputSearchService extends ActionManager {

    public static void navegarInputSearch() {
        navigateTo(PropertyManager.getProperty("web.base.url"));

    }
    public static void clickSearchButton () {
        click(Practica1Constants.BUTTON_SEARCH_XPATH);

    }
    public static void setSearchInput (String busqueda ){
        setInput(Practica1Constants.INPUT_SEARCH_BOX,busqueda,true);
    }

    public static void verificarBusqueda(String busqueda){
        String palabraObtenida = getElement(Practica1Constants.MYACCOUNT_STATUS).getText();
       palabraObtenida = palabraObtenida.toLowerCase();
       palabraObtenida = palabraObtenida.replace("\"","");
        Assert.assertEquals(busqueda,palabraObtenida,"la palabra no coincide con lo que encontramos");


    }


}
