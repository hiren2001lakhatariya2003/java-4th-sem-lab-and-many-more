package com.company;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the size of array");
        int size = sc.nextInt();
        int sum=0;
        int numbers[] = new int[20];
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        System.out.println("Sum of even number is :" + sum);
    }
}
