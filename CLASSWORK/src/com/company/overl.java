package com.company;

public class overl {

        public static void main(String[] args) {
            int a = ans(2,3);
            int b = ans(2,3,4);
            double c = ans(4.5,5.6);
            System.out.println(a+"\n"+b+"\n"+c);
        }
         static int ans(int x,int y)
        {
            return (x+y);
        }
        static int ans(int x,int y,int z)		{
            return (x+y+z);
        }
        static double ans(double x,double y)
        {
            return (x+y);
        }

    }
