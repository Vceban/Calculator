/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.howtonamehomework;
import java.util.Scanner;
/**
 *
 * @author 37360
 */
public class hamework_zad1 {
    public void a1() {
            System.out.println("Enter start digit");
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int j = scan1.nextInt();
        System.out.println("Enter start digit one more time");
        //int x = scan.nextInt();
        for (int x  = scan.nextInt();x < 160 + j; x++){
            if (x % 8 == 0)
                System.out.println(x); 
            }
}
}
