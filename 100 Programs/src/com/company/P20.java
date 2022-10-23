//Program(20) :~ WAP to find a power a^b (without using power and multiplication operation).

package com.company;

import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number : ");
        int number = sc.nextInt();  //number
        System.out.println("Power : ");
        int power = sc.nextInt(); // power
        int temp=number; // store value of number in temp
        int sum = 0; // by default sum =0
        for(int i=1;i<power;i++) // power loop
        {
            for(int j=0;j<number;j++) // numbers loop
            {
                sum+=temp; // sum of number
            }
            temp=sum; // change the number value with sum value
            sum=0;// for sum of new number
        }
        System.out.println(temp); //print answer
    }
}
