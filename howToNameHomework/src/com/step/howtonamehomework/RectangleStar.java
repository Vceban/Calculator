/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.howtonamehomework;

/**
 *
 * @author 37360
 */
public class RectangleStar {
    static int n = 5;
    public void rect(){

        for (int x = 1; x <= n; x++){
            for (int i = 1; i <= x; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
            
        for (int i = 0; i <= n; i++){
            for(int j = 1; j < n - i; j++){
                System.out.print("*");                 
            }
            System.out.println();
         }
    
    }
}
