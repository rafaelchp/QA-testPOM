package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaAgregarAlCarroObject;
import com.dekosas.PageObjects.PaginaProductosObject;
import com.dekosas.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

/*
 *@author Rafael Chica.
 */
public class PaginaAgregarAlCarroSteps {

    PaginaProductosObject paginaProductosObject= new PaginaProductosObject();
    PaginaAgregarAlCarroObject paginaAgregarAlCarroObject= new PaginaAgregarAlCarroObject();
    EsperaImplicita wait= new EsperaImplicita();


    @Step
    public void validarFechaEnvio(){

        Assert.assertThat(paginaProductosObject.getDriver()
                .findElement(paginaProductosObject.getMsjFechaEnvio()).isDisplayed(), Matchers.is(true));

    }

    @Step
    public  void  cantidadProducto(){
        paginaAgregarAlCarroObject.getDriver().findElement(paginaAgregarAlCarroObject.getLstCantidad())
                .clear();
        paginaAgregarAlCarroObject.getDriver().findElement(paginaAgregarAlCarroObject.getLstCantidad())
                .sendKeys("3");
    }

    @Step
    public  void clicAgregarAlCarro(){
        paginaAgregarAlCarroObject.getDriver().findElement(paginaAgregarAlCarroObject.getBtnAgregarAlCarro()).click();
        wait.esperaImplicita(4);

    }

    @Step
    public void validarResumenCompra(){

        Assert.assertThat(paginaAgregarAlCarroObject.getDriver()
                .findElement(paginaAgregarAlCarroObject.getMsjResumenCompra()).isDisplayed(), Matchers.is(true));

    }
}
