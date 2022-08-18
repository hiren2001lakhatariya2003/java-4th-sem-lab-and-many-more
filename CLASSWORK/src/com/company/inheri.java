package com.company;

public class inheri {
    public static void main(String[] args) {
        bc b = new bc();
        b.add();
        cd c = new cd();
        c.add();
    }
}
class ab {
   void add()
   {
       System.out.println("add1");
   }
}
class bc extends ab{
    void add()
    {

        System.out.println("add2");
    }
}
class cd extends ab
{
    void add()
    {
        System.out.println("add3");
    }
}


