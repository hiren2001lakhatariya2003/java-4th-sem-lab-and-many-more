package com.company;

import java.util.Scanner;

public class MulArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [3][6];
        int run=0;
        double Average;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<6;j++)
            {
                System.out.print("Over: "+(i+1)+" and Ball: "+(j+1)+" Run:");
                a[i][j]= sc.nextInt();
                run +=a[i][j];

            }
        }
        System.out.println("total run : " + run);
        System.out.println("average Run : " + (run/3));
    }
}
