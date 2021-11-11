package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Practica1Constants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void navegarLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url")+ "/index.php?controller=authentication&back=my-account");

    }

    public static void clickSignIn() {
        click(Practica1Constants.SIGNIN_XPATH);
    }

    public static void clickSubmit() {
        click(Practica1Constants.SUBMIT_XPATH);
    }


    public static void enviarEmail(String email) {
        setInput(Practica1Constants.H1_ADDRESS_XPATH, email, true);
    }

    public static void enviarPass(String password) {
        setInput(Practica1Constants.H1_PASSWORD_XPATH, password, true);
    }

    public static void verificarSignIn() {

        waitVisibility(Practica1Constants.MYACCOUNT_STATUS);
        String palabraObtenida = getText(Practica1Constants.MYACCOUNT_STATUS);
        Assert.assertEquals( palabraObtenida,"MY ACCOUNT", "Los elementos no coinciden");

    }
}
