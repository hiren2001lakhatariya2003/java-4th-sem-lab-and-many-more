package com.company;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int sum=0;
        int temp=number;
        int count=0;
        while (temp!=0) {
            temp=temp/10;
            count++;
        }
        while (number!=0)
        {
            
        }
        System.out.println(sum);
    }
}
