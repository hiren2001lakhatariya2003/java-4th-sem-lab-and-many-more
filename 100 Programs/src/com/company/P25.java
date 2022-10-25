package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class P25 {

    public static int Array(int[] a, int i, int m)
    {
        if(m>a.length-1) { // if not found then return -1
            return -1;
        }
        if(a[i]==m) {// return index of searched element.
            return i;
        }
        return Array(a, i+1, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size = sc.nextInt();;

        int a[] = new int[size];

        System.out.println("Enter the values");
        for(int i=0;i<size;i++) {
            System.out.print("a["+i+"] : ");
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the value for find in array");

        System.out.print("Value : ");
        int m = sc.nextInt();

        int search = Array(a,0,m);// return index of searched element.

        if(search!=-1) {
            System.out.println("The index of "+m+" is : "+search);
        }
        else{
            System.out.println(m+" is not found in array.");
        }
    }
}
