/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.employeemanager;
import java.util.Scanner;
/**
 *
 * @author 37360
 */
public class Employee {
    
    String adress, firstName, lastName;
    int dateOfBirthday;
    char gender;
    int salary;
      
    public Employee(String adress, String firstName, String lastName){
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void AddEmployees(){
        Scanner scan = new Scanner(System.in);
        Employee [] arr;
        System.out.println("How many people need to add?");
        int howMany = scan.nextInt();
        arr = new Employee[howMany];
        for(int i = 0; i < howMany; i++){
            System.out.println(arr[i] = new Employee("adress", "first", "last"));
        }
        
    }
}
