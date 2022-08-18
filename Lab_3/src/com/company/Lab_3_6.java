package com.company;

import java.util.Scanner;

public class Lab_3_6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.println("1 for + \n 2 for - \n 3 for * \n 4 for / \n 5 for %");

        System.out.print("Enter the number for calculation : ");
        int Ch = sc.nextInt();

        switch(Ch)
        {
            case 1 :
                System.out.println(a + " + "  + b + " = " + (a+b));
                break;

            case 2 :
                System.out.println(a + " - " + b + " = " + (a-b));
                break;

            case 3 :
                System.out.println(a + " * " + b + " = " + (a*b));
                break;

            case 4 :
                System.out.println(a + " / " + b + " = " + (a/b));
                break;

            case 5 :
                System.out.println(a + " % " + b + " = " + (a%b));
                break;

        }
    }
}