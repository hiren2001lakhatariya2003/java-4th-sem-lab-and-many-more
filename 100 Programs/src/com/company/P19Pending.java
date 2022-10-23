package com.company;

import java.util.Scanner;

public class P19Pending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size = sc.nextInt();;

        int array1[] = new int[size]; // for store value
        int array2[] = new int[size];
        int max=0;
        int rem=0;
        System.out.println("Enter the values");
        for(int i=0;i<size;i++) { // take value from user
            System.out.print("array["+i+"] : ");
            array1[i]=sc.nextInt();

            if(array1[i]>max)
                max=array1[i];

        }
        System.out.println(max);
        while(max!=0)
        {
            rem=max%10;
            max=max/10;
        }
        System.out.println(rem);
        for(int i=0;i<rem;i++)
        {
            array2[array1[i]/size] = array1[i];
            System.out.println(array2[i]);
        }

    }
}

