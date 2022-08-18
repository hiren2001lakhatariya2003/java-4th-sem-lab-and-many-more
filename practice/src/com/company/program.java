package com.company;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mutableclass m1= new mutableclass();
       int w;
       w= sc.nextInt();
      int re= m1.add5(w);
        System.out.println(re);
    }

}
class mutableclass
{

    int  add5(int a)
    {
        return a+5;
    }
}
