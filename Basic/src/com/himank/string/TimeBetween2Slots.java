package com.himank.string;

import java.util.Scanner;

public class TimeBetween2Slots {

    int sec, min, hr;

    public static void main(String[] args) {
        System.out.println("Enter the First time");
        TimeBetween2Slots t1 = TimeBetween2Slots.readTime();
        TimeBetween2Slots t2 = TimeBetween2Slots.readTime();
        int s = t2.getTime() - t1.getTime();
        if (s < 0)
            s = s + (12 * 60 * 60);
        System.out.println("Number of Seconds are: " + s);
        int s1 = s, min1 = 0, hr1 = 0;
        if (s1 >= 60) {
            min1 = s1 / 60;
            s1 = s1 % 60;
        }
        if (min1 >= 60) {
            hr1 = min1 / 60;
            min1 %= 60;
        }
        System.out.println("Hour: " + hr1 + " Minutes: " + min1 + " Seconds: " + s1);
    }

    public TimeBetween2Slots(int sec, int min, int hr) {
        super();
        if (hr == 12) {
            hr = 0;
        }
        this.sec = sec;
        this.min = min;
        this.hr = hr;
    }

    private static TimeBetween2Slots readTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time(hr::min::sec)");
        int hr = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        return new TimeBetween2Slots(sec, min, hr);
    }

    private int getTime() {
        return (hr * 60 * 60) + (min * 60) + sec;
    }
}
