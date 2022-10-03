//Program(1):~ WAP to find a sum of even number into 1D array.

package com.company;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the size of array");
        int size = sc.nextInt();  // array size
        int sum=0; // total sum of even number
        int numbers[] = new int[20];
        for(int i=0;i<size;i++) //input from user
        {
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++) // main condition (number[i]%2==0)
        {
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        System.out.println("Sum of even number is :" + sum); //print answer
    }
}
