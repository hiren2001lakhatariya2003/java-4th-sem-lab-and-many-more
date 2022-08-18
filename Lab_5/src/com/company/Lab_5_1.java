package com.company;

import java.util.Scanner;

public class Lab_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle :");
        double p = sc.nextDouble();
        System.out.print("Enter the Rate (in %) :");
        double r = sc.nextDouble();
        System.out.print("Enter the year :");
        double n = sc.nextDouble();
        Lab_5_1 it = new Lab_5_1();
        double inter = it.i(p,r,n);
        System.out.println(inter);

    }
    double i(double a,double b,double c)
    {
        double i;
        i = a * (b/100) * c;
        return i;
    }
}
