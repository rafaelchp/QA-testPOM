package com.dekosas.PageObjects;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */
@DefaultUrl("https://dekosas.com/")
public class PaginaPrincipalPageObject extends PageObject{
    By btnCuenta= By.xpath("//h3[.='Bienvenido']");
    By txtCorreo= By.xpath("//input[@id='social_login_email']");
    By txtPassword= By.xpath("//input[@id='social_login_pass']");
    By btnEntrar= By.xpath("//button[@id='bnt-social-login-authentication']");
    By msjLoginExitoso= By.xpath("//h3[.='Bienvenido']");


    public By getBtnCuenta() {
        return btnCuenta;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }

    public By getMsjLoginExitoso() {
        return msjLoginExitoso;
    }


}
