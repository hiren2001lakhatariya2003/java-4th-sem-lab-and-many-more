package com.company;

import java.util.Scanner;

public class P17 {
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
            int x=array[i];
            int j=i-1;
            while (j>=0 && x<array[j])
            {
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=x;
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        
    }
}
