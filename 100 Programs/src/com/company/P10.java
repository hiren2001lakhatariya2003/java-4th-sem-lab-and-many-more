// Program(10):~ WAP to find a prime number between range (range should be entered by user).
package com.company;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int first = sc.nextInt();
        System.out.println("Enter the first number :");
        int last = sc.nextInt();
        int flag=0;

        for (int i=first;i<=last;i++)
        {
            flag=0;
            for (int j=2;j<i;j++) {
                if(i%j==0) {
                    flag=1;
                    break;
                }
                else
                    flag=0;
            }
            if(flag==0) {
                System.out.print(i+" ");
            }
        }
    }
}
