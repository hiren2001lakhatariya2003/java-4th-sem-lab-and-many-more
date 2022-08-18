package com.company;
import java.util.Scanner;

public class Lab_3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.print("B = ");
		int b = sc.nextInt();

		System.out.print("C = ");
		int c = sc.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a + " (A) is Highest");
			}
			else {
				System.out.println(c + " (C) is Highest");
			}
		}
		else {
			if(b>c)
			{
				System.out.println(b + " (B) is Highest");
			}
			else{
				System.out.println(c + " (C) is Highest");
			}
		}

	}
}