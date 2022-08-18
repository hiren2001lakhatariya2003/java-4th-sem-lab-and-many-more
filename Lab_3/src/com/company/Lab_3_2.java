package com.company;
import java.util.Scanner;
public class Lab_3_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Charater : ");
            char ch = sc.next().charAt(0);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            {
                System.out.println("Given Character is Vowel");
            }
            else
            {
                System.out.println("Given Character is Consonant");
            }
        }
    }
