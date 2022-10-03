package com.company;

import java.util.Scanner;

class Factor{
    public void find_factor(int a,int i) // function for find factors
    {
        if(a%i==0)
            System.out.print(i +", "); // for (last-1)

    }
}
public class P3_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt(); // input number from user
        Factor fc = new Factor(); // create object
        for (int i=1;i<number;i++)
        {
           fc.find_factor(number,i); // call method of class Factor
        }
        System.out.println(number); // print last number
    }
}


