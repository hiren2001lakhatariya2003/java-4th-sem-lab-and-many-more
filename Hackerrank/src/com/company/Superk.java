package com.company;

public class Superk {
    public static void main(String[] args) {
       cube_weight cw1 = new cube_weight(10,20,20,2.5);
       cube_weight cw2 = new cube_weight(100,200,300,2.5);

        System.out.println(cw1.volume());
        System.out.println(cw1.weight);
        System.out.println(cw2.volume());
        System.out.println(cw2.weight);
    }
}
class cube
{
    double height,width,length;

    cube(double h , double w , double l)
    {
        height =h;
        width=w;
        length=l;

    }
    public double volume()
    {
        return height*width*length;
    }
}
class cube_weight extends cube
{
    double weight;
        cube_weight(double h,double w, double l,double m)
        {
            super(h,w,l);
            weight=m;
        }
}
