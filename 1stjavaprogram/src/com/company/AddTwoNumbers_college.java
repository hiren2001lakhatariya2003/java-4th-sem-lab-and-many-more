package com.company;

import java.util.Scanner;

public class AddTwoNumbers_college {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number :");
        int num1 = sc.nextInt();

        System.out.println("enter the second number");
        int num2= sc.nextInt();

        int sum = num1 + num2;

        System.out.print("the addition of two numbers is : ");
        System.out.println(sum);

    }
}
