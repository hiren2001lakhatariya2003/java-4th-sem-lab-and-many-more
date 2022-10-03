//Program(2):~ WAP to find whether string is palindrome or not.

package com.company;

import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine(); // actual string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i); // reverse string
        }
        if (str.equals(rev)) { // print result with compare both string (str and rev)
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}