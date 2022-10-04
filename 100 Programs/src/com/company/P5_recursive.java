//Program(5):~WAP to find a summation of a digit of a given number. (Recursive)


package com.company;
import java.util.Scanner;

class Digit{
    int sum=0; // class variable
    public int Sum(int n) {
        if(n!=0) {
            int temp = n%10;
            sum+=temp;
            Sum(n/10); // call method
        }
        return sum; //return answer
    }
}
public class P5_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        Digit dgt = new Digit(); // make object of class Digit
        int ans = dgt.Sum(number);
        System.out.println(ans); //print answer
    }
}
