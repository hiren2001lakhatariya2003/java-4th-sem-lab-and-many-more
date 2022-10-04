//Program(3):~  WAP to find a Factor of a given number (recursive)

package com.company;
import java.util.Scanner;

class Factor{
    public void find_factor(int n,int i) // function for find factors
    {
        if(i<n) {
            if (n % i == 0)
                System.out.print(i+", ");
            find_factor(n,i+1); // call method
        }

    }
}
public class P3_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt(); //user input

        Factor f = new Factor(); // make object
        f.find_factor(number,1);
        System.out.println(number);
    }
}
