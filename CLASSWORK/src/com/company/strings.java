package com.company;

public class strings {
    public static void main(String[] args) {
        String s = new String("");
        int word=1;
        s=s.trim();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                word++;
            }

        }

        System.out.println(word);

    }
}
