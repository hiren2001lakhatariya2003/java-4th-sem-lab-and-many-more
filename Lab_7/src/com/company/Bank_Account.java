package com.company;

import java.util.Scanner;

public class Bank_Account {
    long Account_No;
    String User_Name;
    String Email;
    String Account_Type;
    double Account_balance;

    public void GetAccountDetails() {
        System.out.println("~~~~~~~~~~~~ Get Account Details ~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.print("Account_No : ");
        Account_No = sc.nextLong();
        System.out.print("User_Name : ");
        sc.nextLine();
        User_Name = sc.nextLine();
        System.out.print("Email :");
        Email = sc.nextLine();
        System.out.print("Account_Type:");

        Account_Type = sc.nextLine();
        System.out.print("Account_balance:");
        Account_balance = sc.nextDouble();


    }
    public void DisplayAccountDetails()
    {

        System.out.println("~~~~~~~~~~~~ print Account Details ~~~~~~~~~~~~~");
        System.out.println("Account_No      : " + Account_No);
        System.out.println("User_Name       : " + User_Name);
        System.out.println("Email           : " + Email);
        System.out.println("Account_Type    : " + Account_Type);
        System.out.println("Account_Balance : " + Account_balance + " ₹");

    }
    public static void main(String[] args)
    {
        Bank_Account bank = new Bank_Account();
        bank.GetAccountDetails();
        bank.DisplayAccountDetails();
    }
}
