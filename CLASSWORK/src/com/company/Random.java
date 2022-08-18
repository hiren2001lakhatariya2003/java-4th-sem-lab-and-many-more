package com.company;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=1;i<=500;i++)
        {
            System.out.println(Math.random());
        }
    }
}
