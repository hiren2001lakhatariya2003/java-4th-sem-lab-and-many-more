package com.company;

import java.util.Scanner;

// print all subset of array ex.[1,2,3] -> [1],[2],[3],[1,2],[2,3],[1,3],[1,2,3]
public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array: ");
        int n = sc.nextInt();

        int a[]=new int[n];
        System.out.println("please enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        {

            if(i==n-1)
            {
                System.out.print(a[i]);
            }
            else
            {
                System.out.print(a[i]+",");
            }
        }
        System.out.print("]");


    }// static mathod


}//Subset
