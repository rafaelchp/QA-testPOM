package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaPpalCategoriasObject;
import com.dekosas.PageObjects.PaginaProductosObject;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

/*
 *@author Rafael Chica.
 */
public class PaginaProductosSteps {
    PaginaProductosObject paginaProductosObject= new PaginaProductosObject();
    PaginaPpalCategoriasObject paginaPpalCategoriasObject= new PaginaPpalCategoriasObject();
    Scroll scroll= new Scroll();
    EsperaImplicita wait= new EsperaImplicita();

    @Step
    public void validarMsj(){
        wait.esperaImplicita(4);
        Assert.assertThat(paginaPpalCategoriasObject.getDriver()
                .findElement(paginaPpalCategoriasObject.getMsj()).isDisplayed(), Matchers.is(true));

    }


    @Step
    public void clicImagenProducto(){


        scroll.scrollElemento(paginaProductosObject.getDriver(),paginaProductosObject.getImgProducto());


        paginaProductosObject.getDriver().findElement(paginaProductosObject.getImgProducto()).click();

    }

    @Step
    public void validarFecha(){
        wait.esperaImplicita(4);
        Assert.assertThat(paginaProductosObject.getDriver()
                .findElement(paginaProductosObject.getMsjFechaEnvio()).isDisplayed(), Matchers.is(true));

    }

}
