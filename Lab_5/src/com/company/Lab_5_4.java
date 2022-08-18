package com.company;

import java.util.Scanner;

public class Lab_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for check if it is prime or not :");
        int n=sc.nextInt();
        System.out.println("1 for prime \t0 for not prime:");
        Lab_5_4 prime = new Lab_5_4();
        int pr = prime.check(n);
        System.out.println(pr);
    }
   public int check (int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }

        }
        return 1;
    }
}
