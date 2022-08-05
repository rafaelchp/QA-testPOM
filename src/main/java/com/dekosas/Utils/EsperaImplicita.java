package com.dekosas.Utils;

/*
 *@author Rafael Chica.
 */
public class EsperaImplicita {
    public  void esperaImplicita(int segundos){
        try{
            Thread.sleep(segundos*1000);
        }catch (InterruptedException e){
            e.printStackTrace(System.out);

        }
    }
}
