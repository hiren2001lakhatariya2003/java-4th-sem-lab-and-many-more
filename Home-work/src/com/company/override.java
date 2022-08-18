package com.company;

class neww {
    double area() {
        return 0;
    }
}
class triangle extends neww
{
    double area(double j,double i)
    {
        return (0.5)*i*j;
    }
}
class ractangle extends neww
{
    double area(double i,double j)
    {
        return i*j;
    }
}
class circle extends neww

{
    double area(double i)
    {
        return 24.0/7.0*i*i;
    }
}

class override
{
    public static void main(String[] args) {
        triangle t = new triangle();
        circle c = new circle();
        ractangle r = new ractangle();

        System.out.println("area of triangle :"+ t.area(2.0,3.0));
        System.out.println("area of circle :"+ c.area(2.0));
        System.out.println("area of ractangle :"+ r.area(4.0,5.0));

    }
}
