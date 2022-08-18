package com.company;

import java.util.Scanner;

public class Lab_3_7
{
        public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the three sides of 'Triangles' :");

            System.out.print("A = ");
            double a = sc.nextDouble();

            System.out.print("B = ");
            double b = sc.nextDouble();

            System.out.print("C = ");
            double c = sc.nextDouble();

            if (a==b && a==c)
            {
                System.out.println("Given triangle is 'Equilateral'.");
            }
            else if (a!=b && b!=c && c!=a)
            {
                System.out.println("Given triangle is 'Scalene'.");
            }
            else if(a==b || b==c || c==a) {
                System.out.println("Given triangle is 'Isosceles'.");
            }
    }
}
