package com.company;

import java.util.Scanner;

public class Lab_6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix :");
        int n = sc.nextInt();
        int a[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("a["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
