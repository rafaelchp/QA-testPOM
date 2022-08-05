package com.dekosas.StepDefinition;

/*
 *@author Rafael Chica.
 */
import com.dekosas.Steps.PaginaAgregarAlCarroSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
public class AgregarAlCarroStepDefinition {

    @Steps
    PaginaAgregarAlCarroSteps paginaAgregarAlCarroSteps;

    @Dado("^que el usuario se encuentre en el producto seleccionado$")
    public void que_el_usuario_se_encuentre_en_el_producto_seleccionado() {
        paginaAgregarAlCarroSteps.validarFechaEnvio();

    }


    @Cuando("^El usuario escoja la cantidad de productos$")
    public void el_usuario_escoja_la_cantidad_de_productos() {
        paginaAgregarAlCarroSteps.cantidadProducto();

    }

    @Cuando("^haga clic en el boton agregar al carrito$")
    public void haga_clic_en_el_boton_agregar_al_carrito() {
        paginaAgregarAlCarroSteps.clicAgregarAlCarro();

    }

    @Entonces("^visualizara un mensaje de carrito de compras$")
    public void visualizara_un_mensaje_de_carrito_de_compras() {
        paginaAgregarAlCarroSteps.validarResumenCompra();

    }

}
