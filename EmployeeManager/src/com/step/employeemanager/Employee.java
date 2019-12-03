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
    
    private String adress, firstName, lastName;
    int dateOfBirthday;
    char gender;
    int salary;
      
    public Employee(String adress, String firstName, String lastName){
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return "Adress: " + adress + "\nFirst name: " + firstName + "\nLast name: " + lastName + "\n\n";
    }
}
