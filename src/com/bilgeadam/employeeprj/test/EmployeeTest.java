package com.bilgeadam.employeeprj.test;

import com.bilgeadam.employeeprj.entitiy.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Aziz Sancar");
        Employee emp2 = new Employee("Uğur Coşkun");


        emp1.setAge(70);
        emp1.setDesignation("DNA Bilimi");
        emp1.setSalary(20000);
        System.out.println(emp1);
        emp2.setAge(60);
        emp2.setDesignation("Biyoteknoloji");
        emp2.setSalary(1000000);
        System.out.println(emp2);

        emp1.printEmployee();
        emp2.printEmployee();
    }
}
