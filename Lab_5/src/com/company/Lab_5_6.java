package com.company;

import java.util.Scanner;

public class Lab_5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number :");
        int n = sc.nextInt();
        System.out.println("enter the 2nd number :");
        int m = sc.nextInt();
        int finalnumber = 0;
        if (n < m) {
            finalnumber = n;
        } else {
            finalnumber = m;
        }

        for (int i = finalnumber; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println(i);
                break;
            }

        }


    }
}
