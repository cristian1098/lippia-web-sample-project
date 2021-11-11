package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Practica1Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.List;
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
     private static List <Double> getPriceList(){
        List<WebElement> priceList = getElements(Practica1Constants.LIST_PRICE_XPATH);
        List<Double> priceDoubleList = new ArrayList<>();
        for (WebElement price:priceList) {
              priceDoubleList.add(Double.parseDouble(price.getText().replace("$","")));

        }
        return priceDoubleList;

    }

    public static void verifyList(){
        List<Double> list = getPriceList();
        for (int i = 0; i < list.size()-1 ; i++) {
            Assert.assertTrue(list.get(i)< list.get(i+1),"lista desordenada");

        }
    }

    public static void verificarBusqueda(String busqueda){
        String palabraObtenida = getElement(Practica1Constants.TITLE_ARTICLE_XPATH).getText();
       palabraObtenida = palabraObtenida.toLowerCase();
       palabraObtenida = palabraObtenida.replace("\"","");
        Assert.assertEquals(busqueda,palabraObtenida,"la palabra no coincide con lo que encontramos");


    }
    public static void ordenarDeMenorAMayor(){
        Select sortBy = new Select(getElement(Practica1Constants.ID_SORT_XPATH));
        sortBy.selectByVisibleText("Price: Lowest first");
    }


}
