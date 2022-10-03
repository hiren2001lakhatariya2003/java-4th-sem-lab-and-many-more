package com.company;

import java.util.Scanner;
import java.lang.String;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s[i]);
        }

    }

}