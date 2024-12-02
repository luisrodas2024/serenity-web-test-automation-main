package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarAlCarrito {
    public static Performable perform(String productName) {
        return Task.where("{0} selects the product '" + productName + "'",
                Click.on(HomePage.A_PRODUCT(productName)),
                Click.on(HomePage.BTN_ADD_TO_CART));
    }
}