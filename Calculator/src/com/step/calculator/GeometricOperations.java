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
public class GeometricOperations {
    public double rectangleArea(double a, double b) {
        return a * b;
                }
    public double rectanglePerimetr( double a, double b){
        return (a+b)*2;
    }
        public double squareArea(double a){
            return Math.pow(a,2);
        }
        public double sqaurePerimetr(double a){
            return a * 4;
        }
        public double triangleArea(double a, double b, double c){
            return a + b + c;
        }
        public double trianglePerimetr(double a,double b, double c){
            double polPerimetr = (a + b + c)/2;
            return Math.sqrt (polPerimetr*(polPerimetr - a) * (polPerimetr - b) * (polPerimetr - c));
        }
    
}
