package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int num=sc.nextInt();
                boolean s = true;
                for(int i=(num/2);i>0;i--)
                {
                    if(i*i==num)
                    {
                        System.out.println(i);
                    }

                }

            }
        }
