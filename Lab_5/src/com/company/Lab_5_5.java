package com.company;

import java.util.Scanner;

public class Lab_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius for find area of circle : ");
        float r = sc.nextFloat();
        System.out.println("Enter the sides for find area of triangle : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();;
        System.out.println("Enter the length width for find area of square : ");
        float h = sc.nextFloat();
        float w = sc.nextFloat();
        Lab_5_5 circle = new Lab_5_5();
        float cir = circle.area(r);
        Lab_5_5 triangle = new Lab_5_5();
        float tri = triangle.area(a,b,c);
        Lab_5_5 square = new Lab_5_5();
        float squ = square.area(h,w);
        System.out.println("area of circle = " + cir);
        System.out.println("area of triangle = " + tri);
        System.out.println("area of square = " + squ);


    }

    public float area(float r) {
        float PI = 22.0f / 7;
        return (PI * r * r);
    }

    public float area(float h, float w) {
        return h*w;
    }
    public float area(float a, float b,float c)
    {
        float s=(a+b+c)/2;
        float sqrt=s*(s-a)*(s-b)*(s-c);
        return (float) Math.sqrt(sqrt);
    }

}