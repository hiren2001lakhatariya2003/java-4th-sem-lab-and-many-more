package com.company;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args)
    {
        String uname,pwd;
        double balance = 100000;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Username :");
        uname = sc.next();
        System.out.print("Enter Password : ");
        pwd = sc.next();
        if(uname.equals("du"))
        {
            if(pwd.equals("1234"))
            {
                System.out.println("balance : "+balance);
            }
        }
        else
        {
            System.out.println("invalid Username or Password");
        }
    }
}
