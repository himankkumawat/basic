package com.himank.basic1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter any year");
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        if (y % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } else if (y % 100 == 0) {
            System.out.println("Year is not a leap Year");
        } else if (y % 4 == 0) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
        sc.close();
    }
}
