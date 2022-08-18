package com.company;
import java.util.*;
public class area {
    public static void main(String[] args) {
        ract r = new ract();
        r.area();
        circle c = new circle();
        c.area();
        triangle t = new triangle();
        t.area();
    }
}
abstract class shape{
    int a,b;
     abstract void  area();
}

class ract extends shape
{
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width");
        a=sc.nextInt();
        b=sc.nextInt();
        int ract = a*b;
        System.out.println("ractangle : " + ract);
    }
}
class circle extends shape
{
   public void area ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        a=sc.nextInt();
        double cir = 3.14 * a * a;
        System.out.println("Circle :" + cir);
    }
}
class triangle extends shape
{
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height");
        a=sc.nextInt();
        b=sc.nextInt();
        int tri = a*b;
        System.out.println("triangle : " + tri);
    }
}
