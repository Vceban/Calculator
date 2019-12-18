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
    private int dateOfBirthday;
    private char gender;
    private int salary;

    public String getAdress() {
        return adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
      
    public Employee(String adress, String firstName, String lastName){
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    }
        @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Employee)){
            return false;
        }
        Employee otherObj = (Employee) obj;
        boolean firstNameEquals = this.firstName.equals(otherObj.firstName);
        boolean lastNameEquals = this.lastName.equals(otherObj.lastName);
        boolean adressEquals = this.adress.equals(otherObj.adress);
        boolean compare = firstNameEquals && lastNameEquals && adressEquals;
        return  compare;
    }
    @Override
    public String toString(){
        return "Adress: " + adress + "\nFirst name: " + firstName + "\nLast name: " + lastName + "\n\n";
    }
}
