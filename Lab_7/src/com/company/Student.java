package com.company;

import java.util.Scanner;

public class Student {
    long Enrollment_No;
    String Student_Name;
    int Semester;
    double CPI;
    double SPI;

    public void GetStudentDetails() {
        System.out.println("~~~~~~~~~~~~ Get Student Details ~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enrollment_No : ");
        Enrollment_No = sc.nextLong();
        System.out.print("Student_Name : ");
        sc.nextLine();
        Student_Name = sc.nextLine();
        System.out.print("Semester :");
        Semester = sc.nextInt();
        System.out.print("CPI:");
        CPI = sc.nextDouble();
        ;
        System.out.print("Spi :");
        SPI = sc.nextDouble();
    }
        public void DisplayStudentDetails()
        {
            System.out.println("~~~~~~~~~~~~ print Student Details ~~~~~~~~~~~~~");
            System.out.println("Enrollment_No  : " + Enrollment_No);
            System.out.println("Student_Name   : " + Student_Name);
            System.out.println("semester       : " + Semester);
            System.out.println("CPI            : " + CPI);
            System.out.println("SPI            : " + SPI);

        }
        public static void main(String[] args)
        {
         Student sc = new Student();
         sc.GetStudentDetails();
         sc.DisplayStudentDetails();
        }
    }
