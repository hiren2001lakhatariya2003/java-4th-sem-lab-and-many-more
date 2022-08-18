package com.company;

import java.util.Scanner;

public class Lab_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        double r = sc.nextDouble();

        Circle cir = new Circle();
        cir.area(r);
        cir.perimeter(r);
    }
}
class Circle {

    public void area(double r)
    {
        double area = (22.0/7) * r * r;
        System.out.println("Area of Circle : " + area);
    }
    public void perimeter(double r)
    {
        double perimeter = 2 * (22.0/7)*r;
        System.out.println("Perimeter of Circle : " + perimeter);
    }

}
