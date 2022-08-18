package com.company;
import java.util.Scanner;
public class Exercise_1_college {
    public static void main(String[] args) {
        System.out.println("enter the marks from 100 :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Maths : ");
        int M = sc.nextInt();
        System.out.print("English : ");
        int E = sc.nextInt();
        System.out.print("Gujrati : ");
        int G = sc.nextInt();
        System.out.print("Science : ");
        int S = sc.nextInt();
        System.out.print("Social Science : ");
        int SS = sc.nextInt();

        int sum = M+E+G+S+SS;
        System.out.print("Total : ");
        System.out.println(sum);

        float Parsentage = sum * 0.2f;
        System.out.print("the Parsentage : ");
        System.out.print(Parsentage);
        System.out.print("%");
    }
}
