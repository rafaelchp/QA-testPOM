package com.dekosas.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 *@author Rafael Chica.
 */
public class Scroll {

    public void scrollElemento(WebDriver driver, By elemento){
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        WebElement element= driver.findElement(elemento);
        jse.executeScript("arguments[0].scrollIntoView()",element);

        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();

        }
    }
}
