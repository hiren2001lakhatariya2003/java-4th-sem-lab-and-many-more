package com.company;

import java.util.Scanner;

public class Lab_6_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n = sc.nextInt();
        int even=0,odd=0;
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] % 2 == 0)
            {
                even = even + 1;

            }
            else
            {
                odd = odd + 1;
            }
        }
        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd);

    }
}
