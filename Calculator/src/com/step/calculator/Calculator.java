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
public class Calculator {

    // умножение, деление, вычитание, сложение

    public double plus(double a, double b){
        return a + b;
    }
    public double minus(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double division(double a, double b){
if (b == 0)
    System.out.println("not possible divide to 0");
        return a / b;
    }
    public double percent(double a, double b){
        return a * b/100;
    }
    public double absolutValue(double a, double b){
        return a % b;
    }
            
}

