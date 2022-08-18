package com.company;

import java.util.Scanner;

public class QuickQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("X-Y/2");
//        System.out.print("X = ");
//        double X = sc.nextDouble();
//        System.out.print("Y = ");
//        double Y = sc.nextDouble();
//        double A = (X - Y)/2;
//        System.out.println("A = " + A);

//        System.out.print("a = ");
//        double a = sc.nextDouble();
//        System.out.print("b = ");
//        double b = sc.nextDouble();
//        System.out.print("c = ");
//        double c = sc.nextDouble();
//        double D = ((b*b)-(4*a*c))/(2*a);
//        System.out.println("D = " + D);

        System.out.print("v = ");
        double v = sc.nextDouble();
        System.out.print("u = ");
        double u = sc.nextDouble();
        double A = v*v-u*u;
        System.out.println("A = " + A);

    }
}
