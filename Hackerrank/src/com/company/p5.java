package com.company;

import java.util.*;
import java.io.*;



class p5{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long num=sc.nextLong();
                System.out.println(num+" can be fitted in:");

                if(num>=(-Math.pow(2,7)) && num<=(Math.pow(2,8)))
                {
                    System.out.println("* byte");
                }
                if(num>=(-Math.pow(2,15)) && num<=(Math.pow(2,16)))
                {
                    System.out.println("* short");
                }
                if(num>=(-Math.pow(2,31)) && num<=(Math.pow(2,32)))
                {
                    System.out.println("* int");
                }
                if(num>=(-Math.pow(2,63)) && num<=(Math.pow(2,64)))
                {
                    System.out.println("* long");
                }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



