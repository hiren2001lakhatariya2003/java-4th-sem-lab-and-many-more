package com.company;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,5,6};
        System.out.println("enter search element :");
        int search= sc.nextInt();;
        int low=0;
        int high=a.length-1;
        int flag=0;
        while(high>=low)
        {
            int mid=(low+high)/2;
            if(search==a[mid])
            {
                flag=1;
                System.out.println("element is found at" + mid + "index");
                break;
            }

            else if(search<a[mid])
            {
                high=mid-1;

            }
            else if (search>a[mid])
            {
                low=mid+1;
            }

        }
        if(flag==0)
        {
            System.out.println("element is not found");
        }
    }
}
