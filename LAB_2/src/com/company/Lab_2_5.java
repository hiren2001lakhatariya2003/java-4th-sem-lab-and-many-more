package com.company;

import java.util.Scanner;

public class Lab_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value in meter : ");
        double meter = sc.nextDouble();
        double feet = meter * 3.281;

        System.out.println(meter+ " meters = " + feet + " feet");
    }
}
