package com.company;

public class Excep {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try
        {
            double c = a/b;
            System.out.println("answer :" + c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("divided by zero");
        }
        finally {
            System.err.println("good bye");
        }
    }
}
