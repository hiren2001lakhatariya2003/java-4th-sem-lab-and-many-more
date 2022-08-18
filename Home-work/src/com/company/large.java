package com.company;

import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int a[]=new int [n];

        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int large=a[0];
        int small=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
            if(a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.println("large :" + large);
        System.out.println("small = "+ small);
    }
}
