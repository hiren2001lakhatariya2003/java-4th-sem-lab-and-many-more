package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter your choice :  1:add\n2:sub\n3:exit");
        int c = sc.nextInt();
        switch (c)
        {
            case 1 :{
                System.out.println("add = "+ (a+b));
                break;
            }
            case 2 :{
                System.out.println("sub = " + (a-b));
                break;
            }
            case 3 :{
                break;
            }

        }
    }
}
