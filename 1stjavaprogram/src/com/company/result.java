package com.company;
import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out of 100");
        System.out.print("maths : ");
        int maths = sc.nextInt();
        System.out.print("english : ");
        int english = sc.nextInt();
        System.out.print("gujrati : ");
        int gujrati = sc.nextInt();
        System.out.print("science : ");
        int science = sc.nextInt();
        System.out.print("social_science : ");
        int social_science = sc.nextInt();

        int sum = maths + english + gujrati + science + social_science;
        System.out.println("the total sum of marks : " + sum);

        double per = sum * 0.2;

        System.out.println("the persentage of given marks : " + per +"%");



    }
}
