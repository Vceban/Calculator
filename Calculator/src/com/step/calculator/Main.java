/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.calculator;
import java.util.Scanner;
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
        
        GeometricOperations abc = new GeometricOperations();
        System.out.println("Perimetr of rectangle = " + abc.trianglePerimetr(1, 2, 3));
        Game r = new Game();
        Scanner scan = new Scanner(System.in);
        int userNumber;
        int randNumber = r.randNumber();
        do{
            System.out.println("Enter your digit");
            userNumber = scan.nextInt();
            if (userNumber > randNumber || userNumber < randNumber)
                System.out.println("vi ne ygadali, try again");
            else
                System.out.println("yes. you win!");
        }
        while(userNumber != randNumber);
        System.out.println(r.randNumber());
        
    };
    
}

    
