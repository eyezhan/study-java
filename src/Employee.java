import java.io.*;

public class Employee{
    String name;
    int age;
    String designation;
    double salary;
    // Employee constructor
    public Employee(String name){
        this.name = name;
    }
    // Set age
    public void empAge(int empAge){
        age = empAge;
    }
    // Set designation
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    // Set salary
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    // Print information
    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

