package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaPrincipalPageObject;
import com.dekosas.Utils.Datos;
import com.dekosas.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

/*
 *@author Rafael Chica.
 */
public class PaginaPrincipalSteps {
    PaginaPrincipalPageObject paginaPrincipalPageObject= new PaginaPrincipalPageObject();
    EsperaImplicita wait= new EsperaImplicita();
    Datos datos= new Datos();

    @Step
    public void abrirNavegador(){
        paginaPrincipalPageObject.open();
        wait.esperaImplicita(1);
    }

    @Step
    public void clicCuenta(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCuenta()).click();
    }

    @Step
    public  void ingresarCorreo() throws IOException {
        String data= datos.leerDatosExcel("Login.xlsx","credenciales",1,0);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtCorreo())
                .sendKeys(data);

    }

    @Step
    public  void ingresarPassword() throws IOException {
        String data= datos.leerDatosExcel("Login.xlsx","credenciales",1,1);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtPassword())
                .sendKeys(data);

    }

    @Step
    public void clicEntrar(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnEntrar()).click();

    }

    @Step
    public  void validarMsjeExito(){
        Assert.assertThat(paginaPrincipalPageObject.getDriver().findElement(
                paginaPrincipalPageObject.getMsjLoginExitoso()
        ).isDisplayed(), Matchers.is(true));

    }



}
