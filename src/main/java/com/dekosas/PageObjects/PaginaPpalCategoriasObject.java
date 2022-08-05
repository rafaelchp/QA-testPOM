package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */

public class PaginaPpalCategoriasObject extends PageObject {

    By btnMenu = By.xpath("//div[@id='main-toggle-menu']");
    By lnkCatIluminacion= By.xpath("//a[@href='https://dekosas.com/co/iluminacion']");
    By lnkSubcatEspacios= By.xpath("//a[@href='https://dekosas.com/co/iluminacion?cat=538']");
    By msj= By.xpath("//strong[@id='titulo-widget']");

    public By getBtnMenu() {
        return btnMenu;
    }

    public By getLnkCatIluminacion() {
        return lnkCatIluminacion;
    }

    public By getLnkSubcatEspacios() {
        return lnkSubcatEspacios;
    }

    public By getMsj() {
        return msj;
    }
}
