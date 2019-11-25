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
public class Homework_2zad {
    public void a2()
    {
        Scanner scan = new Scanner(System.in);
        Scanner chislo = new Scanner(System.in);
        System.out.println("Enter digit na kotoroe delit");
        int y = chislo.nextInt();
     System.out.println("Enter your digit");
              for (int x  = scan.nextInt();x < y * 20 + y; x++) {
            if (x % y == 0)
                System.out.println(x);
                }
    }
}
