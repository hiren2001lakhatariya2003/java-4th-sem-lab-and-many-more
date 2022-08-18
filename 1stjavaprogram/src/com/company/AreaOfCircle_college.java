package com.company;
import java.util.Scanner;
public class AreaOfCircle_college {
    public static void main(String[] args)
    {
        System.out.println("The Area Of Circle:");
        int Radius;
        double pi=3.14,area;
        System.out.println("enter the radius of circle : ");
        Scanner sc = new Scanner(System.in);
        Radius = sc.nextInt();
        area = pi * Radius * Radius;
        System.out.print(" the area of circle is : ");
        System.out.println(area);


    }
}
