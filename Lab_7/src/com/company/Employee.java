package com.company;

import java.util.Scanner;

public class Employee {

    long Employee_Id;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    public void GetEmployeeDetails() {
        System.out.println("~~~~~~~~~~~~ Get Employee Details ~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee_Id : ");
        Employee_Id = sc.nextLong();
        System.out.print("Employee_Name : ");
        sc.nextLine();
        Employee_Name = sc.nextLine();
        System.out.print("Designation :");
        Designation = sc.nextLine();
        System.out.print("Age :");
        Age = sc.nextInt();
        System.out.print("Salary :");
        Salary = sc.nextDouble();


    }
    public void DisplayEmployeeDetails()
    {

        System.out.println("~~~~~~~~~~~~ print Employee Details ~~~~~~~~~~~~~");
        System.out.println("Employee_Id     : " + Employee_Id);
        System.out.println("Employee_Name   : " + Employee_Name);
        System.out.println("Designation     : " + Designation);
        System.out.println("Age             : " + Age);
        System.out.println("Salary          : " + Salary + " ₹");

    }

    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.GetEmployeeDetails();
        emp.DisplayEmployeeDetails();
    }
}
