package com.company;

public class Inheritence_Demo {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        B b = new B();
        b.add();
        C c = new C();
        c.DisplayL();
    }
}
class A
{
    int i =10;
    int j=20;
    int k=30;
    void display()
    {
        System.out.println("i=" + i);
        System.out.println("j=" + j);

    }
}
class B extends A
{

    void add()
    {
        System.out.println("i+j+k= " + (i+j+k));
    }
}
class C extends A
{
    int l=30;
    void DisplayL()
    {
        System.out.println("l= " + l);
        System.out.println("i+j+k+l = " + (i+j+k+l));
    }
}