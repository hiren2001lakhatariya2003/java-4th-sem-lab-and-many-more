package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int A = sc.nextInt();
        System.out.print("EnterB = ");
        int B = sc.nextInt();
        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for *");
        System.out.println("4 for /");
        System.out.println("5 for %");
        System.out.println("6 for EXIT");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
            {
                System.out.println(A+" + "+B+" = " + A+B );
                break;
            }
            case 2:
            {
                System.out.println(A+" - "+B+" = "+ (A-B) );
            }
            case 3:
            {
                System.out.println(A+" * "+B+" = " + A*B );
                break;
            }
            case 4:
            {
                System.out.println(A+" / "+B+" = " + A/B );
                break;
            }
            case 5:
            {
                System.out.println(A+" % "+B+" = " + A%B );
                break;
            }
            case 6:
            {
                System.exit(0);
                break;
            }


        }




    }
}
