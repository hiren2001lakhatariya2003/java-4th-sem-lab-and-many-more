package com.company;

import java.util.Scanner;

public class SumOfArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int sum=0;
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("The sum of total number of array is : " + sum);
    }
}
