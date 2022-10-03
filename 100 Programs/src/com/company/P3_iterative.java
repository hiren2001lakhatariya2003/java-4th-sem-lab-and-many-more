//Program(3):~  WAP to find a Factor of a given number (iterative and recursive)

package com.company;

import java.util.Scanner;

public class P3_iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt(); //input number

        for(int i=1;i<number;i++)
        {
            if(number%i==0) { // main condition
                System.out.print(i + ", "); // for (number-1)
            }
        }
        System.out.print(number); //print last number

    }
}
