// Program(12):~ WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
//should be taken from user (Note that you are not allowed to use an array for this)
package com.company;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers? : ");
        int number = sc.nextInt();

        for(int i=1;i<=number;i++) {
            System.out.print("Enter number ("+i+") :");
            int a  = sc.nextInt();
            if (i==1)
                min=a;
            if(a<min)
                min = a;
            if (a>max)
                max = a;
            sum+=a;
        }
        int average  = sum/number;
        System.out.println("min : "+min+"\nmax : "+max+"\naverage : "+average);
    }
}
