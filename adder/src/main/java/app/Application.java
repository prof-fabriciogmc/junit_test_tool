package app;


import model.Adder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A Simple Application that user the Adder class.
 * @author fabricio
 * 
 */
public class Application {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int result = adder.add(1, 2);
        System.out.println("Resultado: " + String.valueOf(result));
    }
}
