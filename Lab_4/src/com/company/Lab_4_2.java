package com.company;

import java.util.Scanner;

public class Lab_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i;
        int ans=1;
        for(i=n;i>1;i--)
        {
            System.out.print(i + " x ");
            ans = ans * i;
        }
        System.out.println("1 = " + ans);
    }
}
