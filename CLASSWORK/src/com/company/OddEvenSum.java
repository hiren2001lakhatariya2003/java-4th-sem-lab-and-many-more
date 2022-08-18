package com.company;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int odd=0,even=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even = even + a[i];
            }
            else
            {
                odd = odd + a[i];
            }
        }
        System.out.println("the sum of odd numbers is :" + odd);
        System.out.println("the sum of even number is :" + even);
    }
}
