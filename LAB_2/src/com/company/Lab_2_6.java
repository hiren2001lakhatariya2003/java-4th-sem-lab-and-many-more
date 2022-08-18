package com.company;

import java.util.Scanner;

public class Lab_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Input Weight In Pound : ");
        double weight = sc.nextDouble();
        System.out.print("Input Height In inches : ");
        double height = sc.nextDouble();
        double kg = weight * 0.45359237;
        double meter = height * 0.0254;

        double BMI = kg/(meter*meter);
        System.out.println("Body Mass Index is " + BMI);
     }
}
