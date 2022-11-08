package com.company;

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int array[] = new int[40];
        int index=0;
        if(a%10==0)
            System.out.println("0");
        while(a!=0)
        {
            int digit = a%10;

            int count=0;
            while (digit!=0)
            {
                int rem = digit%2;
                array[index++]=rem;
                digit=digit/2;
                count++;


            }
            while(count!=4)
            {
                array[index++]=0;
                count++;
            }
            a=a/10;
        }
       for(int i=index-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }
    }
}
