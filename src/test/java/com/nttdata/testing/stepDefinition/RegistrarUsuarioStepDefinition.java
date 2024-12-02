package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Tasks.AgregarAlCarrito;
import com.nttdata.testing.Tasks.LogearUsuario;
import com.nttdata.testing.Tasks.NavigateTo;
import com.nttdata.testing.Tasks.RegistrarUsuario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.*;

import javax.swing.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.assertj.core.api.Assertions.assertThat;



public class RegistrarUsuarioStepDefinition {
    @Given("el {actor} esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @And("selecciona el boton de registro")
    public void seleccionaElBotonDeRegistro() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_SIGN_UP));
    }

    @And("ingresa un nombre de usuario {string} y contrasenia {string}")
    public void ingresaUnNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(HomePage.INP_USERNAME));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(HomePage.INP_PASSWORD));
    }

    @When("selecciona el boton registrar")
    public void seleccionaElBotonRegistrar() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_REGISTRAR));
    }

    @Then("se realiza el registro de manera exitosa")
    public void seRealizaElRegistroDeManeraExitosa() {
        System.out.println("exitoso");
    }

    @When("se registra con un nombre de usuario {string} y contrasenia {string}")
    public void seRegistraConUnNombreDeUsuarioYContrasenia(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.withData(usuario, password));
    }
    //Sign up successful
    //Loguear usuario
    @When("inicia sesion con un nombre de usuario {string} y contraseña {string}")
    public void iniciaSesionConUnNombreDeUsuarioYContraseña(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(LogearUsuario.withData(usuario, password));
    }
    @Then("se realiza el inicio de sesión de manera exitosa")
    public void seRealizaElInicioDeSesiónDeManeraExitosa() {

        System.out.println("exitoso");
    }
    //Agregar producto
    @When("selecciona un producto {string}")
    public void seleccionaUnProducto(String productName) {

        theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.perform(productName));

    }
    @Then("el producto se agrega al carrito")
    public void elProductoSeAgregaAlCarrito() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_ADD_TO_CART));
    }
    @And("se captura el mensaje de la alerta")
    public void seCapturaElMensajeDeLaAlerta() {
        Actor actor = OnStage.theActorInTheSpotlight();
        WebDriver driver = BrowseTheWeb.as(actor).getDriver(); // Accede al WebDriver del actor
        Alert alert = driver.switchTo().alert();
        String mensajeDelAlert = alert.getText();
        // Devolver el mensaje capturado
        System.out.println(mensajeDelAlert);
        JOptionPane.showMessageDialog(null, mensajeDelAlert); //Aparece un mensaje con el contido del Alert
    }
}

//Capturar Texto he imprimirlo

