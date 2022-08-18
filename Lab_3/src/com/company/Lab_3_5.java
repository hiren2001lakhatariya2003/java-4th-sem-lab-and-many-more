package com.company;
import java.util.Scanner;

public class Lab_3_5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.print("B = ");
		int b = sc.nextInt();

		System.out.print("C = ");
		int c = sc.nextInt();

		
		int large = a>b?(a>c?a:c) : (b>c ? b:c);
		System.out.print("Large Number is : " + large);

	}
}