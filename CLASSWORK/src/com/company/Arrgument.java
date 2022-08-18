package com.company;
public class Arrgument
{
    public static void main(String[] args) {
car c = new car();
       c.top();
       c.left();
       c.right();
    }
}
abstract class Arrguments {
    abstract void left();
    abstract void right();
    abstract void top();

}
class car extends Arrguments
{

    @Override
    void left() {
        System.out.println("Left");
    }

    @Override
    void right() {
        System.out.println("Right");
    }

    @Override
    void top() {
        System.out.println("top");
    }
}