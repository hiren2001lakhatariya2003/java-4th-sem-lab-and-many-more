package com.company;

import java.util.Scanner;

public class Lab_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();
        if(i>0)
        {
            System.out.println(i + " is positive");
        }
        else if(i==0)
        {
            System.out.println("you entered Zero");
        }
        else
        {
            System.out.println(i + " is nagative");
        }
    }
}
