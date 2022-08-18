package com.company;

import java.util.Scanner;

public class Lab_9_2{
    public static void main(String[] args) {


        Details[] de = new Details[5];

        for (int i = 0; i < 5; i++) {
            de[i] = new Details();
            de[i].getstudentdetails();


        de[i].displaystudentdetails();}
    }

}
class Details {
    long Enroll;
    String name;
    int sem;
    double cpi;

    public void getstudentdetails() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Please enter Enrollment no : ");
            Enroll = sc.nextInt();
            System.out.print("Please enter the student name : ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Please enter the sem : ");
            sem = sc.nextInt();
            System.out.print("Please enter the CPI : ");
            cpi = sc.nextDouble();

    }

        public void displaystudentdetails() {

                System.out.println("Enrollment No : " + Enroll);
                System.out.println("Student Name : " + name);
                System.out.println("Sem : " + sem);
                System.out.println("CPI : " + cpi);

        }
    }
