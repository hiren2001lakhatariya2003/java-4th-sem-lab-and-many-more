package com.company;

import java.util.Scanner;

public class P18 {
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

        for(int i=0;i<size-1;i++){
            int minj = i;
            int minx=array[i];
            for(int j=i+1;j<size;j++) {
                if(array[j]<minx) {
                    minj=j;
                    minx=array[j];
                }
            }
            array[minj]=array[i];
            array[i]=minx;
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
