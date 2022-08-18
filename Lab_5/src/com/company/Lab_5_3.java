package com.company;

import java.util.Scanner;

public class Lab_5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element");
        int a=sc.nextInt();
        Lab_5_3 fc = new Lab_5_3();
        fc.fb(a);
    }

    void fb(int a){
        int nt,t1=0,t2=1;
        nt=t1+t2;
        System.out.print(t1 + " , " + t2 + " , ");
        for (int i=3;i<=a;i++)
        {
            System.out.print(nt + " , ");
            t1=t2;
            t2=nt;
            nt=t1+t2;

        }
    }
}
