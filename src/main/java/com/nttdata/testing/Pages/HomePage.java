package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    //  SIGN UP

    public static final Target BTN_SIGN_UP = Target.the("Boton para hacer el registro")
            .located(By.id("signin2"));

    public static final Target REGISTER_MODAL = Target.the("Modal de registro")
            .located(By.id("signInModalLabel"));

    public static final Target INP_USERNAME = Target.the("Nombre de usuario")
            .located(By.id("sign-username"));

    public static final Target INP_PASSWORD = Target.the("Contraseña")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTRAR = Target.the("Boton Registrar")
            .located(By.xpath("//button[text()='Sign up']"));



    //Agregar Producto
    public static Target A_PRODUCT(String productName) {
        return Target.the("Product with name '" + productName + "'")
                .located(By.xpath("//a[text()='" + productName + "']"));
    }
    public static final Target BTN_ADD_TO_CART = Target.the("Boton para agregar al carrito")
            .located(By.xpath("//a[text()='Add to cart']"));

    //logearse
    public static final Target BTN_LOGIN1 = Target.the("Boton para mostar ventana de logeo")
            .located(By.id("login2"));
    public static final Target LOG_USERNAME = Target.the("Nombre de usuario")
            .located(By.id("loginusername"));

    public static final Target LOG_PASSWORD = Target.the("Contraseña")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOGIN2 = Target.the("Boton para hace el logueo")
            .located(By.xpath("//button[text()='Log in']"));

}
