// Program(14):~ WAP to calculate an angle between hour and minute hand. (Hours and minutes should be
//taken from user).
package com.company;

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Hour : ");
        int hour = sc.nextInt();

        System.out.println("Minute : ");
        int minute  = sc.nextInt();
        double answer;

        if(hour == 12) hour = 0;
        if(minute == 60) minute = 0;

        double hAngle =  0.5*((60 * hour) + minute);
        double mAngle = 6 * minute;

        if(mAngle<hAngle)
            answer = hAngle - mAngle;

        else
            answer=mAngle-hAngle;

        if(answer>360-answer)
            answer=360-answer;

        System.out.println(answer);
    }
}
