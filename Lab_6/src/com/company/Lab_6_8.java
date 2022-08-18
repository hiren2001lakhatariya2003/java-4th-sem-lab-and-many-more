package com.company;

import java.util.Scanner;

public class Lab_6_8
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a[][]=new int[4][4];
        for (int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("a[" + i + "][" + j + "]:");
                a[i][j] = sc.nextInt();
            }
        }
        int row;
        int col;
        for (int i=0;i<4;i++)
        {
            row=0;
            for(int j=0;j<4;j++)
            {
                row+=a[i][j];
            }
            System.out.println("sum of "+i+"th row =" +row);

        }
        for (int i=0;i<4;i++)
        {
            col=0;
            for(int j=0;j<4;j++)
            {
                col+=a[j][i];
            }
            System.out.println("sum of "+i+"th column =" +col);

        }
    }
}
