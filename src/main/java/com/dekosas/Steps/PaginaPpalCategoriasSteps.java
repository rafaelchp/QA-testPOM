package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaPpalCategoriasObject;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

/*
 *@author Rafael Chica.
 */
public class PaginaPpalCategoriasSteps {
    PaginaPpalCategoriasObject paginaPpalCategoriasObject= new PaginaPpalCategoriasObject();
    Scroll scroll= new Scroll();
    EsperaImplicita wait= new EsperaImplicita();

    @Step
    public void clicCategorias(){
        wait.esperaImplicita(4);
        paginaPpalCategoriasObject.getDriver().findElement(paginaPpalCategoriasObject.getBtnMenu()).click();

    }
    @Step
    public void cliclnkIluminacion(){


        paginaPpalCategoriasObject.getDriver().findElement(paginaPpalCategoriasObject.getLnkCatIluminacion()).click();
        paginaPpalCategoriasObject.getDriver().findElement(paginaPpalCategoriasObject.getLnkSubcatEspacios()).click();



    }

}
