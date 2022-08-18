package com.company;

import java.util.Scanner;

public class Lab_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int a= sc.nextInt();
        System.out.println("Enter the second number :");
        int b= sc.nextInt();
        Lab_5_1 gr=new Lab_5_1();
        large(a,b);
    }
    public static void large (int x, int y)
    {
        if(x>y)
        {
            System.out.println(x + " is greater than " + y);
        }
        else
        {
            System.out.println(y + " is greater than " + x);
        }
    }
}
