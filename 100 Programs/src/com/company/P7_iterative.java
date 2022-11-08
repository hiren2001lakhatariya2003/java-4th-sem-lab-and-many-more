package com.company;

import java.util.Scanner;

public class P7_iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if (number == 0)
            System.out.println("0");
        else if (number == 1)
            System.out.println("0 1");
        else {
            System.out.print("0 1 ");
            for (int i = 2; i < number; i++) {
                int c = first + second;
                System.out.print(c + " ");
                first = second;
                second = c;
            }
        }
    }
}
