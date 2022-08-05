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
    By btnHome = By.xpath("//img[@src='https://dekosas.com/co/media/logo/stores/1/micro_logo.png']");

    By txtBusqueda= By.xpath("//input[@name='q']");
    By btnBuscar= By.xpath("//span[.=' sofacama']");



    public By getLstCantidad() {
        return lstCantidad;
    }

    public By getBtnAgregarAlCarro() {
        return btnAgregarAlCarro;
    }

    public By getMsjResumenCompra() {
        return msjResumenCompra;
    }

    public By getBtnHome() {
        return btnHome;
    }

    public By getTxtBusqueda() {
        return txtBusqueda;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }
}
