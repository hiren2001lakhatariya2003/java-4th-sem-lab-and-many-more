package com.company;

public class InterfaceInheritance {
    public static void main(String[] args) {
Q q = new Q();
q.printP();
q.printP1();
q.printP2();
q.printP12();
    }
}
interface P
{
    final int p=10;
    void printP();
}

interface P1 extends P {
    final int p1 = 5;
    void printP1();

}
interface P2 extends P
{
    final int p2=20;
    void printP2();
}

interface P12 extends P1,P2
{
    final int p12=12;
    void printP12();
}

class Q implements P12

{
    public void printP()
    {
        System.out.println("dispP : "+p);
    }
    public void printP1()
    {
        System.out.println("dispP1 : "+p1);
    }
    public void printP2()
    {
        System.out.println("dispP2 : "+p2);
    }
    public void printP12()
    {
        System.out.println("dispP12 : "+p12);
    }
}

