package com.company;

import java.util.Scanner;

public class P26 {
    static int power=0;
    static int final_sum=0;
    public static int decimal(int a,int sum)
    {

        while(a!=0) {
            int rem = a % 10;
            if (rem == 1) {
                while (power!=0) {
                    sum*=2;
                    power--;

                }
                final_sum+= sum;
            }
            else {
                sum+=0;

            }

            a=a/10;
            power++;
            return decimal(a,sum);
        }
        return final_sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number : ");
        int number  = sc.nextInt();
        int decimal_number = decimal(number,1);
        System.out.println(decimal_number);
    }
}
