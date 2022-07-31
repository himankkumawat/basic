package com.himank.string;

import java.util.Scanner;

public class Date {

    int dd, mm, yy;
    int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println("Enter the First date");
        Date d1 = Date.readDate();
        System.out.println("Enter the Second date");
        Date d2 = Date.readDate();
        System.out.println("First Date: " + d1.getDate());
        System.out.println("Second Date: " + d2.getDate());
        System.out.println("Number of Days Between two Dates: " + (d2.getNumberOfDays() - d1.getNumberOfDays()));
    }

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    private static Date readDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date(ss,mm,yyyy) format");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yy = sc.nextInt();
        return new Date(dd, mm, yy);
    }

    String getDate() {
        return dd + "/" + mm + "/" + yy;
    }

    private int getNumberOfDays() {
        int days;
        int y = yy - 1;
        days = y * 365;
        days += (y / 4 + y / 400 - y / 100);
        for (int i = 1; i < mm; i++) {
            days += month[i];
        }
        days += dd;
        return days;
    }
}
