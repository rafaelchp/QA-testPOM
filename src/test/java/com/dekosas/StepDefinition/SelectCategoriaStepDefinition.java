package com.dekosas.StepDefinition;

import com.dekosas.Steps.PaginaPpalCategoriasSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

/*
 *@author Rafael Chica.
 */
public class SelectCategoriaStepDefinition {

    @Steps
    PaginaPpalCategoriasSteps paginaPpalCategoriasSteps;

    @Dado("^que el usuario se encuentre en la pagina de inicio$")
    public void que_el_usuario_se_encuentre_en_la_pagina_de_inicio() {
        paginaPpalCategoriasSteps.clicCategorias();

    }


    @Cuando("^El usuario de clic en el boton de categorias$")
    public void el_usuario_de_clic_en_el_boton_de_categorias() {

        paginaPpalCategoriasSteps.cliclnkIluminacion();


    }

    @Entonces("^el usuario visualizara todas las categorias$")
    public void el_usuario_visualizara_todas_las_categorias() {

    }



}
