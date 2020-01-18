/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1. Добавление сотрудника. Приложение должно спросить сколько сотрудников нужно добавить, потом добавить каждого отдельно.
//2. Выведение на экран списка сотрудников.
//3. Изменение сотрудника. Приложение должно вывести на экран всех
//сотрудников и спросить какого нужно изменить потом изменить значение с выведением нынешнего значения.
//4. Удалить сотрудника.
//5. Экспорт: txt, csv, xml, json.
//6. Поиск сотрудников. Приложение должно позволить пользователю выбрать 
//поле по которому искать потом позволить искать используя значение с клавиатуры.
package com.step.employeemanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * z
 *
 * @author 37360
 */
public class EmployeeManager {

    private static ArrayList<Employee> empman = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addEmp() {
        int howMany = sc.nextInt();
        for (int i = 0; i < howMany; i++) {
            empman.add(new Employee(get("Enter adress"), get("Enter name"), get("Enter surname")));
        }
    }

    public void listEmployee() {
        for (int i = 0; i < empman.size(); i++) {
            System.out.println(i + 1 + "." + "\n" + empman.get(i));
        }
    }

    public void editEmployee() {
        listEmployee();
        Scanner changeEmp = new Scanner(System.in);
        System.out.println("Enter the employee to change");
        int k = changeEmp.nextInt();
        Employee secondMan = empman.get(k - 1);
        System.out.println("EX Emp");
        System.out.println(secondMan);
        Employee upd = new Employee(get("Enter new adress"), get("Enter new name"), get("Enter new surname"));
        System.out.println("\nNew Emp");
        empman.set(k - 1, upd);
        System.out.println(empman.get(k));
    }

    public void deleteEmployee() {
        int elementArr = sc.nextInt();
        if (elementArr <= empman.size()) {
            empman.remove(elementArr - 1);
            System.out.println("Success");
        } else {
            System.out.println("There is no such Employee");
        }
    }
    public void searchEmployee() {
        Scanner search = new Scanner(System.in);
        for (Employee el : empman) {
            if (el.getFirstName().equals(search.nextLine())) {
                System.out.println("---");
                break;
            } else if (el.getAdress().equals(search.nextLine())) {
                System.out.println("//");
                break;
            } else if (el.getLastName().equals(search.nextLine())) {
                System.out.println("..");
                break;
            }
        }
    }

    static String get(String message) {
        System.out.println(message);
        Scanner methodGet = new Scanner(System.in);
        String info = methodGet.nextLine();
        return info;
    }
}
