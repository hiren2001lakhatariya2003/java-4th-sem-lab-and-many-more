package com.company;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int i,mul=1;
        for(i=n;i>1;i--)
        {
            System.out.print(i + " x ");
            mul = mul * i;
        }
        System.out.println("1 = " + mul);
    }
}
