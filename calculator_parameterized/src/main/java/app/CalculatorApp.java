/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.Calculator;

/**
 *
 * @author fabricio
 */
public class CalculatorApp {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Soma (1+1): "+ calc.sum(1, 1));
        System.out.println("Subtração (2-3): " + calc.subtract(2, 3));
        System.out.println("Quadrado (4): " + calc.square(4));
    }
    
}
