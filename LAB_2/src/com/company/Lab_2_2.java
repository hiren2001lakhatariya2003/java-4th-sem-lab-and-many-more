package com.company;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args)
    {
    int R;
    double pi = 3.14,area;
        System.out.print("enter the redius for find the area :");
        Scanner s = new Scanner(System.in);
        R = s.nextInt();
        area = R * R * pi;
        System.out.print("Area Of Circle : " + area );

    }

}
