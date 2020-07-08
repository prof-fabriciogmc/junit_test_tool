package app;


import model.AdderFloat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A Simple Application that user the AdderFloat class.
 * @author fabricio
 * 
 */
public class Application {
    public static void main(String[] args) {
        AdderFloat adderFloat = new AdderFloat();
        float result = adderFloat.add(1f, 2f);
        System.out.println("Resultado: " + String.valueOf(result));
    }
}
