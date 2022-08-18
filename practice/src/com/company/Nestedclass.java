package com.company;

public class Nestedclass {
    public static void main(String[] args) {
        Class1 n1 = new Class1();
        n1.Class1method();
    }
}
class Class1{

    public void Class1method()
    {
        int a=20;
        System.out.println("class 1");
       Class2 c1=new Class2();
       c1.Class1method();
        System.out.println(a+ c1.b);
    }
    class Class2
    {
int b=10;
        public void Class1method()
        {
            System.out.println("class 2");

            Class2 c1=new Class2();
            System.out.println(b);


        }
    }
}
