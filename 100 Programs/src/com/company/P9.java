// Program(9):~ WAP to find whether a number is Odd or Even without using a % operator.
package com.company;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number  = sc.nextInt();

        int answer = number /2;

        if(answer * 2==number)
            System.out.println("Given number is even");
        else
            System.out.println("Given number is odd");

    }
}
