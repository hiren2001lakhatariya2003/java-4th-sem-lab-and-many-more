package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }
    }
}
