package com.company;
import java.util.*;
public class OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator : ");
        int n = sc.nextInt();
        System.out.println("Enter the denominator : ");
        int d = sc.nextInt();

        try
        {
            double result=quotient(n,d);
            System.out.println("Result: "+n+"/"+d+"="+result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Dev");
        }
    }
    public static double quotient(int n,int d)
    {
        return n/d;
    }
}
