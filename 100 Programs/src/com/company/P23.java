package com.company;

import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size = sc.nextInt();;

        int array[] = new int[100];

        System.out.println("Enter the values");
        for(int i=0;i<size;i++) {
            System.out.print("array["+i+"] : ");
            array[i]=sc.nextInt();
        }

        System.out.println("Enter the position and value");
        System.out.print("Position : ");
        int position = sc.nextInt();
        System.out.print("Value : ");
        int value = sc.nextInt();
        int temp = array[position];

        for (int i=0;i<size+1;i++) {
                if (i > position + 1) {
                    array[i + 1] = array[i];
                }
                if (i == position + 1) {
                    array[i] = temp;
                }
                if (position == i) {
                    array[i] = value;
                }

            }
        for(int i=0;i<size+1;i++) {
            System.out.print(array[i]+" ");
    }
}}
