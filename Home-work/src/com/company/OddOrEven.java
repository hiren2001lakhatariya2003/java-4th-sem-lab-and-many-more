package com.company;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int i ;
        System.out.print("even = ");
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i + " , ");
            }

        }
        System.out.print("\nodd = ");
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i + " , ");
            }

        }

    }
}
