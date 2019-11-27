/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.employeemanager;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author 37360
 */
public class EmployeeManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       System.out.println("----------------------------------------------");
       System.out.println("1. Add employees");
       System.out.println("2. List employees");
       System.out.println("3. Edit employee");
       System.out.println("4. Delete employee");
       System.out.println("5. Export employees");
       System.out.println("6. Search employees");
       System.out.println("----------------------------------------------");
              System.out.println("Select menu item");
       int condition = sc.nextInt();
       switch(condition){
           case 1:  {
               Employee add = new Employee("adress", "first", "last");
               add.AddEmployees();
               break;
           }
           case 2:{
               System.out.println("2. List employees");
               break;
           }
           case 3: {
               System.out.println("3. Edit employee");
               break;
           }
           case 4: {
               System.out.println("4. Delete employee");
               break;
           }
           case 5: {
               System.out.println("5. Export employees");
               break;
           }
           case 6:{
               System.out.println("6. Search employees");
               break;
           }
           default: 
               System.out.println("Choose from menu, please");
       }
       System.out.println("----------------------------------------------");
  //      Employee[] arr;
//        Scanner sc = new Scanner(System.in);
    //    System.out.println("The numbers of employers");
        //int howMany = sc.nextInt();
      //  arr = new Employee[4];//howMany];
        //int i;
        //for(i = 0; i <= 3; i++){
         // System.out.println(arr[i] = new Employee("adress", "first", "last"));
         //}
        //for(int j = 0; j < 3; j++){
       // System.out.println(Arrays.toString(arr));
       // }
    }
}