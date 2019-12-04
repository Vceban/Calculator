/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.employeemanager;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author 37360
 */
public class EmployeeManager {
    public static ArrayList<Employee> empman = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addEmp(){
    Scanner arrayInfo = new Scanner(System.in);  
    int howMany = sc.nextInt();
    for (int i = 0; i < howMany; i++){
        System.out.println(" Enter Adress \n First name \n Last name");
        empman.add(new Employee(arrayInfo.nextLine(), arrayInfo.nextLine(), arrayInfo.nextLine()));
        }
    }
        public void listEmployee(){
        for (int i = 0; i < empman.size(); i++) {
            System.out.println(i + 1 + "." + "\n" + empman.get(i));
        }
    }
        public void editEmployee(){
               listEmployee();
               Scanner ko = new Scanner(System.in);
               Scanner newEmp = new Scanner(System.in);
               System.out.println("Enter the employee to change");
               int k = ko.nextInt();
               Employee secondMan = empman.get(k-1);
               System.out.println("EX Emp");
               System.out.println(secondMan);
               System.out.println(" Enter Adress \n First name \n Last name");
               Employee upd = new Employee(newEmp.nextLine(),newEmp.nextLine(),newEmp.nextLine());
               System.out.println("New Emp\n");
               empman.set(k-1, upd);
               System.out.println(empman.get(k));
        }
        public void deleteEmployee(){
            int elementArr = sc.nextInt();
            if (elementArr < empman.size())
            empman.remove(elementArr - 1);
        }
    public static void main(String[] args){
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
               System.out.println("Success");
               
               break;
           }
           case 6:{
               System.out.println(empman.contains("Adress"));
               break;
           }
       }
            }
    }
}
