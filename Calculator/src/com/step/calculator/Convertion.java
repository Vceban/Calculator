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
public class Convertion {
    public double farengeitCelcius(double a) {
        return a * -17.7778;//сделай чтоб не округляло a
    }
    public double poundsKg(double a){
        return a * 0.453592; //сделай чтоб не округляло a
    }
    public double metersFeet(double a){
        return a * 0.3048;
    }
}
