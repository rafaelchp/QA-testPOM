package com.dekosas.StepDefinition;

import com.dekosas.Steps.PaginaPrincipalSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

/*
 *@author Rafael Chica.
 */
public class LoginStepDefinition {

    @Steps
    PaginaPrincipalSteps paginaPrincipalSteps;


    @Dado("^que el usuario se encuentre en el sitio web$")
    public void que_el_usuario_se_encuentre_en_el_sitio_web() {
        paginaPrincipalSteps.abrirNavegador();
        paginaPrincipalSteps.clicCuenta();
    }


    @Cuando("^El usuario ingrese los datos de login$")
    public void el_usuario_ingrese_los_datos_de_login() throws IOException {
        paginaPrincipalSteps.ingresarCorreo();
        paginaPrincipalSteps.ingresarPassword();
        paginaPrincipalSteps.clicEntrar();

    }

    @Entonces("^el usuario visializara un mensaje de bienvenido$")
    public void el_usuario_visializara_un_mensaje_de_bienvenido() {

        paginaPrincipalSteps.validarMsjeExito();

    }
}
