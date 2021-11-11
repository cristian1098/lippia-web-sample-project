package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Practica1Constants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class PriceService extends ActionManager {

    public static void navegarInputSearch() {
        navigateTo(PropertyManager.getProperty("web.base.url"));

    }
    public static void clickSearchButton () {
        click(Practica1Constants.BUTTON_SEARCH_XPATH);

    }
    public static void setSearchInput (String busqueda ){
        setInput(Practica1Constants.INPUT_SEARCH_BOX,busqueda,true);
        Assert.assertTrue(isVisible(Practica1Constants.ID_SORT_XPATH));
    }

    public static void orderByLowest(){
    click(Practica1Constants.ID_SORT_XPATH);
    waitVisibility(Practica1Constants.LOWEST_PRICE_XPATH).click();


    }





}
