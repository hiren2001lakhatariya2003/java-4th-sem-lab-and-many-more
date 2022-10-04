//Program(4):~WAP to find a factorial of a given integer (iterative)

package com.company;

import java.util.Scanner;

public class P4_iterative {
    public static void main(String[] args) {
        int fact = 1; // Factorial variable declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt(); // get input from user

        for(int i=1;i<=number;i++) // main logic of find factorial
            fact*=i;

        System.out.println("The Factorial of "+number+" : "+fact); // print result
    }
}
