package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time");
        int h1= sc.nextInt();
        int m1= sc.nextInt();
        System.out.println("Enter second time");
        int h2= sc.nextInt();
        int m2= sc.nextInt();
        Time1 t1 = new Time1(h1,m1);
        Time1 t2 = new Time1(h1,m2);
        Time1 t = new Time1();
        t.add(t1,t2);
        System.out.println(t.hour + ":" + t.minute);
    }
}
class Time1
{
    int hour;
    int minute;
    public Time1(int hour,int minute)
    {
        this.hour=hour;
        this.minute= minute;
    }
    public Time1(){}
    public void add(Time1 t1,Time1 t2)
    {
        this.hour= t1.hour+ t2.hour;
        this.minute= t1.minute+t2.minute;

        if(this.minute>=60)
        {
            this.hour=this.hour+this.minute/60;
            this.minute=this.minute%60;
        }
    }
}
