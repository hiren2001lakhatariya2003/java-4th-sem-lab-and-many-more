package com.company;

import java.util.Scanner;

public class P28 {
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

        int middle = array[0];

        int temp[] = new int[size];

        for(int i=0;i<size;i++)
        {
            for(int j=i)
        }
    }
}
