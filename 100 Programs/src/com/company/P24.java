//Program(24):- WAP to delete an element from array specified by user. if element is not found print a
//message “Element is not found” (do not take a new array).
package com.company;

import java.util.Scanner;

public class P24 {
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

        System.out.println("Enter the position for delete");
        System.out.print("Position : ");
        int position = sc.nextInt();
        if(position>size-1)// if element is greater then array index then print "Element is not found.".
        {
            System.out.printf("Element is not found.");
        }
        else {
            for (int i = position; i < size; i++) {

                if (i == position) {
                    array[i] = 0; //entered position was converted into 0.
                } else {
                    array[i - 1] = 0; // i-1 position convert into 0.
                    array[i - 1] += array[i]; // add i position's th value in i-1 position's value
                }

            }
            for(int i=0;i<size-1;i++) //print array with size-1 (last element was 0
            {
                System.out.print(array[i]+" ");
            }
        }

    }
}
