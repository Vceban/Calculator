/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.calculator;

/**
 *
 * @author 37360
 */
public class Main {

    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.plus(5,2));
        System.out.println(calc.division(3, 0));
        System.out.println(calc.minus(3, 2));
        System.out.println(calc.multiply(5, 5));
        
    };
    
}

    
