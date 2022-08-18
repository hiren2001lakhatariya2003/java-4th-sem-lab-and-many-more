package com.company;

import java.util.Scanner;

public class Lab_6_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n = sc.nextInt();
        int flag=0;

        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("enter the number for search in array : ");
        int number = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if(a[i] == number)
            {
                flag =1;
                break;
            }
            else {

                flag = 0;

            }
        }
        if (flag==1)
        {
            System.out.println("The value is present in array.");
        }
        else
        {
            System.out.println("The value is not present in array.");
        }

    }
}
