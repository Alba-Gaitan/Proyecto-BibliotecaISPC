package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeServices;


public class AutomationPracticeSteps extends PageSteps {

    @Given("El usuario esta en la pagina de automation practice")
    public void home() {
        HomeServices.navegarWeb();
    }

    @And("hace click en el boton shop")
    public void haceClickEnElBoton() {
            HomeServices.clickButtonShop();
        }

    @When("hace click en el boton home")
    public void Clickbutton2() {
        HomeServices.clickButtonHome();
    }

    @Then("recorre la pantalla visualizando tres sliders")
    public void recorreLaPantallaVisualizandoTresSliders() {
        HomeServices.verifySlider();
    }

    @When("selecciona la opcion {string}")
    public void haceClickEnLaImagen(String opcion) {
        HomeServices.seleccionarImagen(opcion);
    }


    @Then("se visualiza el boton de añadir al carrito")
    public void VisualizarBtnDeAddTobasket() {
        HomeServices.verifyBtn();
    }

    @And("hace click en el boton mi cuenta")
    public void haceClickEnElBotonMiCuenta() {
        HomeServices.clickBtnMyAccount();
    }

    @When("hace click en el boton register")
    public void haceClickEnElBotonRegister() {
       HomeServices.btnRegister();
    }

    @Then("ingresa a la pantalla principal de aplicacion web")
    public void ingresaALaPantallaPrincipalDeAplicacionWeb() {
        HomeServices.panelPrincipal();
    }


    @Then("^se visualiza el mensaje \"(.*)\"$")
    public void seVisualizaElMensaje(String mensaje) {
        HomeServices.loginFallido();
    }

    @And("^ingresa \"(.*)\" y \"(.*)\"$")
    public void ingresaUserAndPass(String user, String pass) {
        HomeServices.ingresaUsuarioYContraseña(user, pass);
    }

    @When("hace click en el boton login")
    public void haceClickEnElBotonLogin() {
        HomeServices.btnLogin();
    }

    @And("hace click en el boton logout")
    public void haceClickEnElBotonLogout() {
        HomeServices.btnLogout();
    }

    @Then("se verifica que cierra sesion exitosamente")
    public void seVerificaQueCierraSesionExitosamente() {
        HomeServices.verifySesion();
    }

    @And("^ingresa \"(.*)\" y \"(.*)\" en el formulario de registro$")
    public void FormularioRegistro(String user, String pass) {
        HomeServices.formRegistro(user, pass);
    }
}