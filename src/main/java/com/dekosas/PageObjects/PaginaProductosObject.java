package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */
public class PaginaProductosObject extends PageObject {

    By imgProducto= By.xpath("//img[@src='https://dekosas.com/co/media/catalog/product/cache/164940938088390570ed192008480ac2/m/t/mt9695-1-2.jpg']");
    By msjFechaEnvio= By.xpath("//strong[.='Fecha estimada de envio']");

    By imgProductoSofa= By.xpath("//img[@src='https://dekosas.com/co/media/catalog/product/cache/164940938088390570ed192008480ac2/a/v/ava_negro_3_.jpg']");




    public By getImgProducto() {
        return imgProducto;
    }

    public By getMsjFechaEnvio() {
        return msjFechaEnvio;
    }

    public By getImgProductoSofa() {
        return imgProductoSofa;
    }
}
