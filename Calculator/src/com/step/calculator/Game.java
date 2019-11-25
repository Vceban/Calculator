/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.step.calculator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 37360
 */
public class Game {
    static int randNumber;
    public int randNumber(){
      Random bok = new Random();
	  	  	  
	  randNumber  =  bok.nextInt(30);
	  
	  return randNumber;
    }
}
