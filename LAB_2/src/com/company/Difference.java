package com.company;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        int b, a, Diff;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        a = sc.nextInt();
        System.out.println("enter 2nd number : ");
        b = sc.nextInt();
        Diff = a - b;
        System.out.println("difference is " + Diff);
        if (Diff > 0) {
            System.out.println("Difference is positive");
        } else if (Diff == 0) {
            System.out.println("here,no difference");
        } else {
            System.out.println("Difference is nagative");
        }
    }
}
