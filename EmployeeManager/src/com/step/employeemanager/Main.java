/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.employeemanager;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Vovan
 */
public class Main {
    public static void main(String[] args) throws IOException{
        File relativeFile = FileUtil.createTextFileRelative();
        EmployeeManager a = new EmployeeManager();
    Scanner sc = new Scanner(System.in);
    exit:
            for (; ;){
       System.out.println("----------------------------------------------");
       System.out.println("1. Add employees");
       System.out.println("2. List employees");
       System.out.println("3. Edit employee");
       System.out.println("4. Delete employee");
       System.out.println("5. Export employees");
       System.out.println("6. Search employees");
       System.out.println("0. Exit");
       System.out.println("----------------------------------------------");
              System.out.println("Select menu item");
       int condition = sc.nextInt();
       switch(condition){

           case 0:{
               break exit;
           }
           case 1:  {   
               System.out.println("Enter the number of employees ");
            a.addEmp();
               break;
           }
           case 2:{
               a.listEmployee();
               break;
           }
           case 3:{
               a.editEmployee();
               break;
           }
           case 4: {
               System.out.println("Select employee number from the list ");
               a.deleteEmployee();              
               break;
             }
           case 6: {
               a.searchEmployee();
               break;
             }
           }
       }
    }

}


