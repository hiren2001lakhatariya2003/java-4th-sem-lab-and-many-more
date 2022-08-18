package com.company;
import java.util.Scanner;

public class Candidate {
    long Candidate_Id;
    String Candidate_Name;
    int Candidate_Age;
    double Candidate_Weight;
    double Candidate_Height;


    public void GetCandidateDetails()
    {
        System.out.println("~~~~~~~~~~~~ Get Candidate Details ~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.print("Candidate_Id : ");
        Candidate_Id = sc.nextLong();
        System.out.print("Candidate_Name : ");
        sc.nextLine();
        Candidate_Name= sc.nextLine();
        System.out.print("Candidate_Age :");
        Candidate_Age=sc.nextInt();
        System.out.print("Candidate_Weight(In Kg):");
        Candidate_Weight= sc.nextDouble();;
        System.out.print("Candidate_Height(In Feet) :");
        Candidate_Height=sc.nextDouble();
    }
    public void DisplayCandidateDetails()
    {
        System.out.println("~~~~~~~~~~~~ print Candidate Details ~~~~~~~~~~~~~");
        System.out.println("Candidate_Id     : " + Candidate_Id);
        System.out.println("Candidate_Name   : " + Candidate_Name);
        System.out.println("Candidate_Age    :" + Candidate_Age);
        System.out.println("Candidate_Weight :" + Candidate_Weight + " Kg");
        System.out.println("Candidate_Height :" + Candidate_Height + " Feet");

    }
    public static void main(String[] args)
    {
     Candidate can = new Candidate();
     can.GetCandidateDetails();
     can.DisplayCandidateDetails();
    }
}
