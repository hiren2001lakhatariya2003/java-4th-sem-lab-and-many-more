package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class P25 {

    public static int Array(int[] a, int l,int r, int m) {

        if(r<l)
        {
            return -1;
        }
        if (a[l] == m) {// return index of searched element.
            return l;
        }
        if (a[r] == m) {// return index of searched element.
            return r;
        }
        return Array(a, l+1,r-1, m);


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

        int search = Array(a,0,a.length-1,m);// return index of searched element.

        if(search!=-1) {
            System.out.println("The index of "+m+" is : "+search);
        }
        else{
            System.out.println(m+" is not found in array.");
        }
    }
}
