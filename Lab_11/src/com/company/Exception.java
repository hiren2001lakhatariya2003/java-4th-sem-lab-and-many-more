package com.company;
import java.lang.*;
import java.util.*;

public class Exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        String s = args[2];
        char c = s.charAt(0);

        switch (c)
        {
            case '+' :
                System.out.println(a+c+b+" = "+(a+b));
                break;

            case '-' :
                System.out.println(a+c+b+" = "+(a-b));
                break;

            case 'x' :
                System.out.println(a+c+b+" = "+(a*b));
                break;

            case '/' :
                System.out.println(a+c+b+" = "+(a/b));
                break;

        }
    }
}
