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
    public void addEmp(){
            Scanner sc = new Scanner(System.in);
    Scanner arrayInfo = new Scanner(System.in);  
    int howMany = sc.nextInt();
    for (int i = 0; i < howMany; i++){
        System.out.println(" Enter Adress \n First name \n Last name");
        empman.add(new Employee(arrayInfo.nextLine(), arrayInfo.nextLine(), arrayInfo.nextLine()));
        }
    }
        public void listEmployee(){
        for (int i = 0; i < empman.size(); i++) {
            System.out.println(i + 1 + " Employee" + "\n" + empman.get(i));
        }
    }
        public void editEmployee(){
               listEmployee();
               Scanner ko = new Scanner(System.in);
        }
    public static void main(String[] args){
        EmployeeManager a = new EmployeeManager();
    Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++){
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
               System.out.println("Enter the number of employees ");
            a.addEmp();
               break;
           }
           case 2:{
               a.listEmployee();
               break;
           }
           case 3:{
               a.listEmployee();
               Scanner ko = new Scanner(System.in);
               System.out.println("Enter the employee to change");
               int k = ko.nextInt();
               System.out.println("EX Emp");
               Employee secondMan = empman.get(k);
               System.out.println(secondMan);
               Employee upd = new Employee("x","y","z");
               empman.set(k, upd);
               System.out.println("New Emp\n");
               System.out.println(empman.get(k));
               break;
           }
//    ArrayList<Employee> empman = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
//    Scanner arrayInfo = new Scanner(System.in);
//        System.out.println("Enter the number of employees ");
//    int howMany = sc.nextInt();
//    for (int i = 0; i < howMany; i++){
//        System.out.println(" Enter Adress \n First name \n Last name");
//        empman.add(new Employee(arrayInfo.nextLine(), arrayInfo.nextLine(), arrayInfo.nextLine()));
//    }
//    Employee a = new Employee("1","2","3");
//    Employee b = new Employee("3", "4", "5");
//    empman.add(a);
//    empman.add(b);
//        System.out.println(a);
//        System.out.println("fuck off");
//        System.out.println(b);
    }
            }}
}
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        for (int i = 0; i < 5; i++){
//       Scanner sc = new Scanner(System.in);
//       Scanner arrayInfo = new Scanner(System.in);
//       System.out.println("----------------------------------------------");
//       System.out.println("1. Add employees");
//       System.out.println("2. List employees");
//       System.out.println("3. Edit employee");
//       System.out.println("4. Delete employee");
//       System.out.println("5. Export employees");
//       System.out.println("6. Search employees");
//       System.out.println("----------------------------------------------");
//              System.out.println("Select menu item");
//       int condition = sc.nextInt();
//       switch(condition){
//           case 1:  {   
//        Employee [] arr;
//        System.out.println("How many people need to add?");
//        int howMany = sc.nextInt();
//        arr = new Employee[howMany];
//        for(int j = 0; j < howMany; j++) {
//            System.out.println(" Enter Adress \n First name \n Last name");
//            System.out.println(arr[j] = new Employee(arrayInfo.nextLine(), arrayInfo.nextLine(), arrayInfo.nextLine()));
//        }
//               break;
//           }
//           case 2:{
//               
//               break;
//           }
//           case 3: {
//               System.out.println("3. Edit employee");
//               break;
//           }
//           case 4: {
//               System.out.println("4. Delete employee");
//               break;
//           }
//           case 5: {
//               System.out.println("5. Export employees");
//               break;
//           }
//           case 6:{
//               System.out.println("6. Search employees");
//               break;
//           }
//           default: 
//               System.out.println("Choose from menu, please");
//       }
//       System.out.println("----------------------------------------------");
//        }
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
