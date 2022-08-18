package com.company;

import java.util.Scanner;

public class Lab_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i;
        int flag=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }

        }
        if(flag==1)
        {
            System.out.println(n + " is not prime number.");
        }
        else
        {
            System.out.println(n + " is prime number.");
        }
    }
}
