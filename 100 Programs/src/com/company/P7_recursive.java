package com.company;

import java.util.Scanner;

class Fibonacci {
    int a=0;
    int b=1;
    int i=2;
    public void series(int n) {

        while (i < n) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            i++;
            series(n);
        }
    }
}

public class P7_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        Fibonacci fc  = new Fibonacci();

        int number = sc.nextInt();
        if(number==0)
            System.out.println("0");
        else if(number==1)
            System.out.println("0 1");
        else
        {
            System.out.print("0 1 ");
            fc.series(number);
        }
    }
}