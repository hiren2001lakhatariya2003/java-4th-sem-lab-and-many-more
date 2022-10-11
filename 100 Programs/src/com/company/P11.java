package com.company;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int sum=0;
        int mul=1;
        int temp=number;
        int count=0;
        while (temp!=0) {
            temp=temp/10;
            count++;
        }
        while (number!=0)
        {
            int rem = number%10;
            mul=1;
            for (int i=1;i<=count;i++) {
                mul = mul * rem;
            }
            sum+=mul;
            number=number/10;
        }
        System.out.println(sum);
    }
}
