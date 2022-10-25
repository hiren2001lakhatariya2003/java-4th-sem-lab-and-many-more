//Program(23):~ WAP to enter an element at specific position into array. (Do not take a new array)
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
        array[size]=0; //last digit =0

        System.out.print("Old array : ");
        for(int i=0;i<size;i++) {
            System.out.print(array[i] + " ");
        }
        for(int i=size;i>=position;i--)
        {
            if(i>0)
            {
                array[i]=array[i-1]; //change the value from last to given position by shift the value of i-1 to i
                if(i==position)
                {
                    array[i]=value; // when we went to given position the change the value of existing entered value to new value at given position
                }
            }
            else
            {
                array[0]=value; // if user enter at 1st position then add new value at 1st position and shift all value with 1 position.
            }
        }
        System.out.print("\nNew array : ");
        for(int i=0;i<size+1;i++) {
            System.out.print(array[i]+" ");
    }
}}
