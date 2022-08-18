package com.company;

import java.util.Scanner;

public class Lab_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Calls :");
        int calls = sc.nextInt();
        double Rs;
        if(calls<=100)
        {
            Rs = 200;

        }
        else if (calls>100 && calls<=150)
        {
            Rs = 200 + ((calls-100) * 0.60);
        }
        else if (calls>150 && calls<=200)
        {
            Rs = 200 + 30 + ((calls-150) * 0.50);
        }
        else
        {
            Rs = 200 + 30 + 25 + ((calls-200) * 0.40);
        }

        System.out.println("the Amount for " + calls + " calls = " + Rs + " Rs");
    }
}
