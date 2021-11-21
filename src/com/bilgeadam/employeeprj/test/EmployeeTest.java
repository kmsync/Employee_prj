package com.bilgeadam.employeeprj.test;

import com.bilgeadam.employeeprj.entitiy.Employee;

import java.util.Date;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Aziz Sancar");
        Employee emp2 = new Employee("Uğur Coşkun");


        emp1.setAge(70);
        emp1.setDesignation("DNA Bilimi");
        emp1.setSalary(20000);
        emp1.setDogtar(new Date());
        System.out.println(emp1);
        emp2.setAge(60);
        emp2.setDesignation("Biyoteknoloji");
        emp2.setSalary(1000000);
        emp2.setDogtar(new Date());
        System.out.println(emp2);

        emp1.printEmployee();
        emp2.printEmployee();
    }
}
