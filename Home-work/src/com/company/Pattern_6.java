package com.company;

import java.util.Scanner;

public class Pattern_6 {
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the number : ");
            int n = sc.nextInt();
            int i, j;
            for (i = n; i >= 1; i--)
            {
                for (j = n; j > i; j--)
                {
                    System.out.print(" ");
                }
                for (j = i; j >= 1; j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (i=1;i<=n;i++)
            {
                for (j=i;j<n;j++)
                {
                    System.out.print(" ");
                }
                for (j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

