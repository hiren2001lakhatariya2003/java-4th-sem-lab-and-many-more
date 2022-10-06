package com.company;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        int rem, count_odd=0,count_even=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number  = sc.nextInt();

        while(number!=0)
        {
            rem= number%10;
            number= number/10;

            if(rem%2==0)
                count_even++;
            else
                count_odd++;
        }

        System.out.println("Odd : " + count_odd);
        System.out.println("Even : " + count_even);
    }
}
