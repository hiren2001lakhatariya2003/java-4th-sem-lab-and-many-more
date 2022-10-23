package com.company;

import java.util.Scanner;

public class P21Pending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size = sc.nextInt();;

        int array[] = new int[size];

        System.out.println("Enter the values");
        for(int i=0;i<size;i++) {
            System.out.print("array["+i+"] : ");
            array[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {

        }
    }
}


