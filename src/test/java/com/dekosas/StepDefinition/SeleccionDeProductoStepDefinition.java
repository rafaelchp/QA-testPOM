package com.dekosas.StepDefinition;

import com.dekosas.Steps.PaginaPpalCategoriasSteps;
import com.dekosas.Steps.PaginaProductosSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

/*
 *@author Rafael Chica.
 */
public class SeleccionDeProductoStepDefinition {
    @Steps
    PaginaProductosSteps paginaProductosSteps;

    @Dado("^que el usuario se encuentre en la categoria seleccionada$")
    public void que_el_usuario_se_encuentre_en_la_categoria_seleccionada() {
    paginaProductosSteps.validarMsj();


    }


    @Cuando("^El usuario de clic en el producto escogido$")
    public void el_usuario_de_clic_en_el_producto_escogido() {
        paginaProductosSteps.clicImagenProducto();

    }

    @Entonces("^el usuario visualizara los detalles del producto$")
    public void el_usuario_visualizara_los_detalles_del_producto() {
       paginaProductosSteps.validarFecha();

    }

}
