package com.company;
import java.util.Scanner;
public class Lab_2_1 {
    public static void main(String[] args) {
        System.out.println("enter the numbes for sum");
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st number : ");
        num1 = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        num2 = sc.nextInt();
        sum = num1 + num2;

        System.out.print("the sum of two numbers is : ");
        System.out.println(sum);
    }
}
