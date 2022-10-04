//Program(5):~WAP to find a summation of a digit of a given number. (Iterative)
package com.company;
import java.util.Scanner;

public class P5_iterative {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number for summation : ");
        int number = sc.nextInt();
        int sum=0;
        while(number!=0) {
            int temp = number%10;
            sum+=temp;
            number = number/10;
        }
        System.out.println(sum);
    }
}
