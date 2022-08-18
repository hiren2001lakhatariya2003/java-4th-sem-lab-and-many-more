package com.company;
import java.util.Scanner;
public class SumofPositivw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int a = sc.nextInt();
            if(a<0)
            {

                continue;

            }
            sum+=a;
        }
        System.out.println(sum);



    }
}
