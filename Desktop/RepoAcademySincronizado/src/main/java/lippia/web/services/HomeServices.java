package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.HomeConstants.*;

public class HomeServices extends ActionManager {

    private static String btnAdd;

    //aqui navega al pom y busca la property
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //llamo a mi locator, establezco una espera y hago click en el boton shop
    public static void clickButtonShop() {
        WebActionManager.waitVisibility(BUTTON_SHOP);
        WebActionManager.click(BUTTON_SHOP);
    }
    public static void clickButtonHome() {

        WebActionManager.waitVisibility(BUTTON_HOME);
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        Actions builder = new Actions(driver);
        WebElement elem = WebActionManager.getElement("XPATH://a[contains(string(),'Home')]");
        builder.moveToElement(elem).click().build().perform();
    }

    public static void verifySlider() {
        WebActionManager.waitVisibility(SLIDER1);
        Assert.assertTrue(WebActionManager.getText(SLIDER1).equalsIgnoreCase("Selenium Ruby")
                && WebActionManager.getText(SLIDER2).equalsIgnoreCase("Thinking in HTML") && WebActionManager.getText(SLIDER3).equalsIgnoreCase("Mastering JavaScript"));
    }

    public static void seleccionarImagen(String opcion){
        WebActionManager.waitVisibility(SLIDER1);
        List<WebElement> selectores = WebActionManager.getElements(SLIDER4);
        for (WebElement selector : selectores) {
            if(selector.getText().equalsIgnoreCase(opcion)){
                   click(selector);
            }
        }
    }

    public static void verifyBtn() {
        Assert.assertTrue(WebActionManager.getText(ADDTOBASKETSRJS).equalsIgnoreCase("Add To Basket")
                || WebActionManager.getText(ADDTOBASKETHTML).equalsIgnoreCase("Add To Basket"));
    }

    public static void clickBtnMyAccount() {
        WebActionManager.click(BTNMYACCOUNT);
    }

    public static void ingresaUsuarioYContraseña(String users, String pass) {
        WebActionManager.waitVisibility(INPUTUSERS);
        setInput(INPUTLOGINUSER, users, true);
        setInput(INPUTLOGINPASS, pass, true);

    }

    public static void btnRegister() {
        WebActionManager.waitVisibility(BTNREGISTER);
        WebActionManager.click(BTNREGISTER);
    }
    public static void panelPrincipal() {
        WebActionManager.waitVisibility(VALIDARPAGE);
        Assert.assertTrue(isVisible(VALIDARPAGE));
    }

    public static void loginFallido() {
        WebActionManager.waitVisibility(ERRORMESSAGE);
        Assert.assertTrue(isVisible(ERRORMESSAGE));
    }

    public static void btnLogin() {
        WebActionManager.waitVisibility(BTNLOGIN);
        WebActionManager.click(BTNLOGIN);
    }

    public static void btnLogout() {
        WebActionManager.waitVisibility(BTNLOGOUT);
        WebActionManager.click(BTNLOGOUT);
    }

    public static void verifySesion() {
        WebActionManager.waitVisibility(TITLELOGIN);
        Assert.assertTrue(isVisible(TITLELOGIN));
    }

    public static void formRegistro(String usuario, String password) {
        WebActionManager.waitVisibility(INPUTUSERS);
        WebActionManager.click(INPUTUSERS);
        setInput(INPUTUSERS, usuario);
        WebActionManager.click(INPUTPASS, password);
        setInput(INPUTPASS, password);
    }
}
