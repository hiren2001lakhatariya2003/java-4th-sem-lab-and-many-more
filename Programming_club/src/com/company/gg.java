package com.company;

import java.util.Scanner;

public class gg {
    static int max_char=256;

    public static void main(String[] args) {
       String s = args[0];
       GetOccuringChar(s);

    }
    static void GetOccuringChar(String str)
    {
        int count[] = new int[max_char];
        for(int i=0;i< str.length();i++) {
            count[str.charAt(i)]++;
        }
            char ch[] = new char[str.length()];

            for(int i=0;i<str.length();i++)
            {
                ch[i]=str.charAt(i);
                int find=0;
                for(int j=0;j<=i;j++)
                {
                    if(str.charAt(i)==ch[j])
                    {
                        find++;
                    }
            }
                if(find==1) {
                    System.out.println("the occurence of " + str.charAt(i) + " is " + count[str.charAt(i)]);
                }
        }

    }
}
