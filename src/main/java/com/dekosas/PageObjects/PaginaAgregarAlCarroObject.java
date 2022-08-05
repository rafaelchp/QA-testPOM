package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */
public class PaginaAgregarAlCarroObject extends PageObject {

    By lstCantidad= By.xpath("//input[@id='qty']");
    By btnAgregarAlCarro= By.xpath("//button[@id='product-addtocart-button']");
    By msjResumenCompra= By.xpath("//strong[.='Resumen']");

    public By getLstCantidad() {
        return lstCantidad;
    }

    public By getBtnAgregarAlCarro() {
        return btnAgregarAlCarro;
    }

    public By getMsjResumenCompra() {
        return msjResumenCompra;
    }
}
