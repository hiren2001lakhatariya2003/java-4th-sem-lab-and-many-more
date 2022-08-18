package com.company;

import java.util.Scanner;

public class Lab_8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int r1= sc.nextInt();
        int i1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int r2= sc.nextInt();
        int i2 = sc.nextInt();
        Complex num1=new Complex(r1,i1);
        Complex num2=new Complex(r2,i2);
        Complex num =new Complex();
        num.add(num1,num2);
        System.out.println(num.real +"." + num.imaginary);
    }
}
class Complex
{
    int real;
    int imaginary;
    public Complex(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public Complex(){}
    public void add(Complex num1,Complex num2)
    {
        this.real=num1.real+ num2.real;
        this.imaginary= num1.imaginary+num2.imaginary;

    }
}
