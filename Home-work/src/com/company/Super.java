package com.company;

public class Super {
        public static void main(String[] args) {
                ssuper s =new ssuper();
                        s.demo();;
                        sub s1 = new sub();
                        s1.demo();
        }
        }
class ssuper
{
        public final void demo()
        {
                System.out.println("super class");
        }
}
class sub extends ssuper
{
        public final void demo()
        {
                System.out.println("sub class");

        }
}