//Program(22_2) :~ Print a following patterns
/*
 *********
  *******
   *****
    ***
     *
 */
package com.company;

import java.util.Scanner;

public class P22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern : ");
        int number = sc.nextInt();

        for(int i=0;i<number;i++)
        {
            for(int j=0;j<i;j++) {
                System.out.print(" "); //space logic
            }
            for(int k=2*(number-i)-1;k>0;k--) {//pattern with decreasing order
                System.out.print("*");
            }
            System.out.println(); //for new line
        }
    }
}
