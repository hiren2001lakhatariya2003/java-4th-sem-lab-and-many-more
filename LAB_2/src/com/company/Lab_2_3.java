package com.company;
import java.util.Scanner;
public class Lab_2_3 {
    public static void main(String[] args) {
        System.out.println("Enter Tempereture in fahrenheit");
        Scanner in = new Scanner(System.in);
        double fahrenheit = in.nextDouble();
        double celcius = ((fahrenheit-32)*5)/9;
        System.out.println("The Temperreture In Celsius : " + celcius);
    }
}
