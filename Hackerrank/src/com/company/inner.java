package com.company;

public class inner {
    public static void main(String[] args) {
        A b1 = new A();
        b1.add();
    }
}
class A
{
    static int i=9;
    int j=3;
    public void add()
    {
        System.out.println("i + j = "+(i+j));
        B b2 = new B();
        b2.add();

    }

   static class B
    { int k=7;
        public void add()
        {
            System.out.println("i + k = "+ (i+k));
        }
    }
}
