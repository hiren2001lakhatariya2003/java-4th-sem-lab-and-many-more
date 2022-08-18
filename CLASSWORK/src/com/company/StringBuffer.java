package com.company;




public class StringBuffer {
    public static void main(String[] args) {
        String s1 = "           abh         abc            ";
        String s2 ="abc";
        /*if(s1.equalsIgnoreCase(s2)){
            System.out.println("Matched");
        }
        else
        {
            System.out.println("Not Matched");
        }*/
                /*if(s1.equals(s2)){
            System.out.println("Matched");
        }
        else
        {
            System.out.println("Not Matched");
        }*/
/*
        int a = s1.compareTo(s2);
        System.out.println(a);*/  // COMPARE STRING

        /*System.out.println(s1.trim());*/ // TRIM THE STRING

        System.out.println(s1.replace('a','h'));
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());




    }

}