package com.company;

import java.util.Scanner;

public class Lab_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int n = sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Array 1");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("a["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array 2");
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("b["+i+"]["+j+"]:");
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[n][n];


        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                c[i][j]=0;
                for(int k=0;k<n;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
    }
}
