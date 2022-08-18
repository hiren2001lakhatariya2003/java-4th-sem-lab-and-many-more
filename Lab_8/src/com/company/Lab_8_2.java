package com.company;

import java.util.Scanner;

public class Lab_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st time:");
        int h1= sc.nextInt();
        int m1=sc.nextInt();
        System.out.println("Enter 2nd time:");
        int h2= sc.nextInt();
        int m2=sc.nextInt();
        Time t1 = new Time(h1,m1);
        Time t2 = new Time(h2,m2);
        Time t3 = new Time();
       t3.add(t1,t2);
        System.out.println(t3.hour + ":" + t3.minute);
    }
}
class Time
{
    int hour;
    int minute;
    public Time(int hour,int minute)
    {
        this.hour=hour;
        this.minute=minute;
    }

    public Time(){}
    public void add(Time t1,Time t2)
    {

        this.hour=t1.hour+t2.hour;
        this.minute=t1.minute+ t2.minute;
        if(minute>=60) {
            this.hour =this.hour + this.minute/60;
            this.minute = this.minute % 60;
        }
    }
}