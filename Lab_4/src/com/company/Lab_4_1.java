package com.company;

import java.util.Scanner;

public class Lab_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number :");
        int i = sc.nextInt();
        System.out.print("Enter the 2nd number :");
        int j = sc.nextInt();
        int n;
        for(n=i;n<=j;n++)
        {
            if(n%2==0 && n%3!=0)
            {
                System.out.print(n +"  ");
            }
        }

    }
}
