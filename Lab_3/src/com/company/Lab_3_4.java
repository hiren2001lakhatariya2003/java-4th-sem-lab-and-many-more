package com.company;
import java.util.Scanner;

class Lab_3_4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Maths : ");
		int i = sc.nextInt();

		System.out.print("Science : ");
		int j = sc.nextInt();

		System.out.print("Hindi : ");
		int k = sc.nextInt();

		System.out.print("Gujrati : ");
		int l = sc.nextInt();

		System.out.print("Sanskrit : ");
		int m = sc.nextInt();

		int sum = i + j+ k + l + m;

		double Per = sum/5;

		if(Per >= 70)
		{
			System.out.println("Distinction");
		}
		
		else if(Per >= 60 && Per <70 )
		{
			System.out.println("First");
		}
		else if(Per >= 45 && Per <60 )
		{
			System.out.println("Second");
		}
		else if(Per >= 35 && Per <45 )
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}