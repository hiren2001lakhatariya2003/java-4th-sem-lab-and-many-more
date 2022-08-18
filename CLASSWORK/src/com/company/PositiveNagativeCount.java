package com.company;

import java.util.Scanner;

public class PositiveNagativeCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int positive=0,nagative=0,zero=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]= ");
            a[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if (a[i] > 0)
            {
                positive = positive + 1;
            }
            else if (a[i] < 0)
            {
                nagative = nagative + 1;
            }
            else
            {
                zero = zero + 1;
            }
        }
        System.out.println("the positive numbers in array is : " + positive);
        System.out.println("the nagative numbers in array is : " + nagative);
        System.out.println("the zero numbers in array is : " + zero);
    }
}
