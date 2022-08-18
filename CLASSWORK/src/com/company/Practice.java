package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st :");
        int a = sc.nextInt();
        System.out.print("2nd :");
        int b = sc.nextInt();
        Practice co = new Practice();
        co.Com(a,b);


    }

    void Com(int x, int y) {
        if (x > y) {
            System.out.println(x + "is greater than" + y);
        } else {
            System.out.println(y + "is greater than" + x);
        }

    }
}


