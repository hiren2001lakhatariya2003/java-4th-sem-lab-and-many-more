// Program(4):~ WAP to find a factorial of a given integer (recursive)
package com.company;

import java.util.Scanner;

class Factorial{
    public int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return (n * (fact(n-1)));
    }
}
public class P4_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Factorial fc =new Factorial();

        int ans= fc.fact(number);
        System.out.println(ans);
    }
}