//Program(22_3) :~ Print a following patterns
/*
 *********
 **** ****
 ***   ***
 **     **
 *       *
 */
package com.company;

import java.util.Scanner;

public class P22_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern : ");
        int number = sc.nextInt();

        for(int i=0;i<number;i++)
        {
            if(i==0)
            {
                for (int j=2*(number-i)-1;j>0;j--)
                {
                    System.out.print("*");

                }
                System.out.println();
            }
            else
            { // from 2nd line
                for (int j=number-i;j>0;j--) // before space logic
                    System.out.print("*");
                for(int k=0;k<(2*i-1);k++) // space logic
                    System.out.print(" ");
                for (int j=number-i;j>0;j--)
                    System.out.print("*"); // after space logic
                System.out.println();
            }
        }
    }
}
