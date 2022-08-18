package com.company;

import java.util.Scanner;

public class CountInArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n = sc.nextInt();
        int a[]=new int[n];
        int count=0;
        int flag=0;

        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
        }
        System.out.print("Enter the number for search :");
        int search = sc.nextInt();
        for(int i=0;i<n;i++)
        {
           if(search==a[i])
           {
               System.out.println("the "+search+" element is an index "+i);
              count++;
              flag=1;
           }
        }

        if (flag==0)
        {
            System.out.println("the element is not present in array");
        }
        else if(count>1)
        {
            System.out.println("so the element is present at total :" +count+" times");
        }

    }
}
