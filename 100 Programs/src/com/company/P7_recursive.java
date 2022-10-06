package com.company;

import java.util.Scanner;

class Fibonacci{
    int i=2;
    public int series(int n,int a,int b)
    {
        int c = 0;
        if (i!=n) {
            c = a + b;
            a = b;
            b = c;
            i++;
            series(n,a,b);
        }
        return c;
    }
}
public class P7_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the size of fibonacci series");
        int number = sc.nextInt();
        Fibonacci fc = new Fibonacci();
        int answer = fc.series(number,a,b);
        if(number==0)
            System.out.println("0");
        else if(number==1)
            System.out.println("0 1");
        else
            System.out.println("0 1 "+ answer);

    }
}
