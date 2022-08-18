package com.company;

public class overr {
    public static void main(String[] args) {
        a A = new a();
        b B = new b();
        c C = new c();
        A.draw();
        B.draw();
        C.draw();
    }

}
class a
{
    void draw()
    {
        System.out.println("draw shape");
    }
}
class b extends a
{
    void draw() {
        super.draw();
        System.out.println("draw circle");
    }
}
class c extends a
{
    void draw() {
        super.draw();
        System.out.println("draw triangle");
    }
}