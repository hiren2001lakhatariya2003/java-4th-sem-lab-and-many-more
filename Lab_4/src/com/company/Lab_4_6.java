package com.company;

import java.util.Scanner;
public class Lab_4_6 {
    public static void main(String[] args) {
        //Declare Variables
        int sumOdd=0,sumEven=0,number;
        //Declare Scanner
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("enter number -(exit for enter 0) :");
            number = sc.nextInt();
            if(number>0 && number % 2 == 0)
                sumEven+=number;
            if(number<0 && number % 2 != 0)
                sumOdd+=number;
            if(number==0)
                break;
        }
        System.out.println("Sum of positive even number:"+sumEven);
        System.out.println("Sum of negative odd number:"+sumOdd);
    }
}