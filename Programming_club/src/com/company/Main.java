package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        if((a*2/100)==0)
        {
            System.out.println("even");

        }
        else
        {
            System.out.println("odd");
        }
    }
}
