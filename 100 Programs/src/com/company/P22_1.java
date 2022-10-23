//Program(22_1) :~ Print a following patterns
/*
    1
   A B
  2 3 4
 C D E F
 */

package com.company;

import java.util.Scanner;

public class P22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern : ");
        int number = sc.nextInt();
        int pattern_number = 1; // for numeric pattern
        char ch ='A'; // for character pattern
        for(int i=0;i<number;i++)
        {
            for(int k=number-i-1;k>=0;k--) {
                System.out.print(" "); //space logic
            }
        if(i%2==0) {
            for (int j = 0; j <= i; j++) { // numaric pattern
                System.out.print(pattern_number + " ");
                pattern_number++; //for number increment
            }
        }
        else {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " "); //character print
                ch++; // character increment
            }
        }
            System.out.println();
        }
    }
}
