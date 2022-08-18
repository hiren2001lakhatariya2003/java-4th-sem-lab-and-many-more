package com.company;

public class countword {
    int ram;
    int rom;
    int backcamera;
    int frontcamera;
    String maker;
    public static void main(String[] args) {
        countword c = new countword(6,6);
        System.out.println(c.ram);
        System.out.println(c.maker);
    }
    public countword()
    {
        ram=2;
        rom=2;
        backcamera=2;
        frontcamera=2;
        maker="apple";

    }
    public countword(int ram,int rom)
    {

        this.ram=ram;
        this.rom=rom;
    }
}
